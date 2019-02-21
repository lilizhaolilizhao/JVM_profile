package com.github.llz.agent;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Opcodes;

public class MyTimeCountAdapter extends ClassVisitor implements Opcodes {
    private String owner;
    private String filedName = "UDASMCN";
    private boolean isInterface;
    private boolean isPresent = false;

    public MyTimeCountAdapter(ClassVisitor classVisitor) {
        super(ASM6, classVisitor);
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        super.visit(version, access, name, signature, superName, interfaces);
        owner = name;

        if (owner.startsWith("com.github.llz.agent".replace(".", "/"))) {
            isInterface = (access & ACC_INTERFACE) != 0;
        }
    }

    @Override
    public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
        if (name.equals(filedName)) {
            isPresent = true;
        }
        return super.visitField(access, name, descriptor, signature, value);
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
}
