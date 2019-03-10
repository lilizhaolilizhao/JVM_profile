package com.taobao.arthas.classvistor;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;

import static org.objectweb.asm.Opcodes.ASM5;

public class MyClassVistor extends ClassVisitor {
    public MyClassVistor() {
        super(ASM5);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        System.out.println("method name is : " + name);

        MethodVisitor mv = cv.visitMethod(access, name, descriptor, signature, exceptions);

        if (name.equals("hello")) {
            System.out.println("===================");
        }
        return mv;
    }
}
