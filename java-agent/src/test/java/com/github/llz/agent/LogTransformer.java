//package com.github.llz.agent;
//
//import org.objectweb.asm.ClassReader;
//import org.objectweb.asm.ClassWriter;
//
//import java.io.IOException;
//import java.lang.instrument.ClassFileTransformer;
//import java.security.ProtectionDomain;
//
//public class LogTransformer implements ClassFileTransformer {
//    @Override
//    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain,
//                            byte[] classfileBuffer) {
//        try {
//            ClassReader cr = new ClassReader(className);
//            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
//            GeneralMethodAdapter timeCountAdpter = new GeneralMethodAdapter(cw);
//            cr.accept(timeCountAdpter, ClassReader.EXPAND_FRAMES);
//
//            return cw.toByteArray();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return new byte[0];
//    }
//}
