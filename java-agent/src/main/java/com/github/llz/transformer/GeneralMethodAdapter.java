package com.github.llz.transformer;

import com.github.llz.util.JVMUtils;
import org.objectweb.asm.*;
import org.objectweb.asm.commons.AnalyzerAdapter;
import org.objectweb.asm.commons.LocalVariablesSorter;

import java.util.List;

/**
 * 通用方法适配
 */
public class GeneralMethodAdapter extends ClassVisitor implements Opcodes {
    protected String owner;
    private String filedName = "CLASS_NAME";
    protected boolean isInterface;
    private boolean isPresent = false;
    protected String methodName;

    public GeneralMethodAdapter(ClassVisitor classVisitor) {
        super(ASM6, classVisitor);
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        super.visit(version, access, name, signature, superName, interfaces);
        owner = name;

        isInterface = (access & ACC_INTERFACE) != 0;
    }

    @Override
    public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
        if (name.equals(filedName)) {
            isPresent = true;
        }
        return super.visitField(access, name, descriptor, signature, value);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);

        String className = owner.replace("/", ".");
        if (TransformerContext.transInfoMap.containsKey(className)) {
            List<TransformerInfoBean> transformerInfoBeans = TransformerContext.transInfoMap.get(className);

            for (TransformerInfoBean transformerInfoBean : transformerInfoBeans) {
                if (!isInterface && mv != null
                        && (transformerInfoBean.getMethodName()).equals(name)
                        && descriptor.equals(JVMUtils.javaTypeToJvmSignature(transformerInfoBean.getParameterTypes(),
                        transformerInfoBean.getReturnType()))) {
                    methodName = name;
                    AddTimerMethodAdapter at = new AddTimerMethodAdapter(mv);

                    at.aa = new AnalyzerAdapter(owner, access, name, descriptor, at);
                    at.lvs = new LocalVariablesSorter(access, descriptor, at.aa);

                    mv = at.lvs;
                }
            }
        }

        return mv;
    }

    @Override
    public void visitEnd() {
        if (!isInterface && !isPresent) {
            FieldVisitor fv = cv.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, filedName, "Ljava/lang/String;", null, owner);
            if (fv != null) {
                fv.visitEnd();
            }
        }
        super.visitEnd();
    }

    class AddTimerMethodAdapter extends MethodVisitor implements Opcodes {
        private int time;
        private int maxStack;
        public LocalVariablesSorter lvs;
        public AnalyzerAdapter aa;

        public AddTimerMethodAdapter(MethodVisitor methodVisitor) {
            super(ASM6, methodVisitor);
        }

        @Override
        public void visitCode() {
            mv.visitCode();
            mv.visitMethodInsn(INVOKESTATIC, "java/lang/System", "nanoTime", "()J", false);
            time = lvs.newLocal(Type.LONG_TYPE);
            mv.visitVarInsn(LSTORE, time);
            maxStack = 4;
        }

        @Override
        public void visitInsn(int opcode) {
            if (((opcode >= IRETURN && opcode <= RETURN) || opcode == ATHROW) && !isPresent) {
                mv.visitMethodInsn(INVOKESTATIC, "java/lang/System", "nanoTime", "()J", false);
                mv.visitVarInsn(LLOAD, time);
                mv.visitInsn(LSUB);
                mv.visitVarInsn(LSTORE, time);

                mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");

                mv.visitTypeInsn(NEW, "java/lang/StringBuilder");
                mv.visitInsn(DUP);
                mv.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
                mv.visitFieldInsn(GETSTATIC, owner, filedName, "Ljava/lang/String;");
                mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);


                mv.visitLdcInsn("  " + methodName + ":");
                mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);

                mv.visitVarInsn(LLOAD, time);
                mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
                mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
                mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);

                maxStack = Math.max(aa.stack.size() + 4, maxStack);
            }
            mv.visitInsn(opcode);
        }

        @Override
        public void visitMaxs(int maxStack, int maxLocals) {
            super.visitMaxs(Math.max(maxStack, this.maxStack), maxLocals);
        }
    }
}
