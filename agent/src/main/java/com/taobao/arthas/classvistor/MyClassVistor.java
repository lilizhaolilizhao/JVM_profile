package com.taobao.arthas.classvistor;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.AdviceAdapter;
import org.objectweb.asm.commons.Method;

public class MyClassVistor extends ClassVisitor implements Opcodes {
    private String className;

    public MyClassVistor(ClassVisitor classVisitor, String className) throws NoSuchMethodException {
        super(ASM5, classVisitor);

        this.className = className;
    }

    public static void methodOnBegin(String className, String methodName, String descriptor, Object target, Object[] args) {
        System.out.println("className is " + className);
        System.out.println("methodName is " + methodName);
        System.out.println("descriptor is " + descriptor);
        System.out.println("target is " + target);
        System.out.println("args is " + args);
    }

    Method MyClassVistor_methodOnBegin = Method.getMethod(MyClassVistor.class.getDeclaredMethod("methodOnBegin",
            String.class, String.class, String.class, Object.class, Object[].class));

    @Override
    public MethodVisitor visitMethod(final int access, final String name, final String descriptor, String signature, String[] exceptions) {
        System.out.println("method name is : " + name);

        MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);

        if (name.equals("hello")) {
            return new AdviceAdapter(ASM5, mv, access, name, descriptor) {
                @Override
                protected void onMethodEnter() {
                    push(className);
                    push(name);
                    push(descriptor);
                    loadThisOrNullIfStatic();
                    loadArgArray();

                    invokeStatic(Type.getType(MyClassVistor.class), MyClassVistor_methodOnBegin);

                    super.onMethodEnter();
                }

                private void loadThisOrNullIfStatic() {
                    if (isStatic()) {
                        push((Type) null);
                    } else {
                        loadThis();
                    }
                }

                private boolean isStatic() {
                    return (ACC_STATIC & methodAccess) == ACC_STATIC;
                }

                @Override
                protected void onMethodExit(int opcode) {
                    super.onMethodExit(opcode);
                }
            };
        }
        return mv;
    }
}
