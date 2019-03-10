package com.taobao.arthas.agent;

import com.taobao.arthas.classvistor.MyClassVistor;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

import java.lang.instrument.ClassFileTransformer;
import java.security.ProtectionDomain;

import static org.objectweb.asm.ClassReader.EXPAND_FRAMES;
import static org.objectweb.asm.ClassWriter.COMPUTE_FRAMES;
import static org.objectweb.asm.ClassWriter.COMPUTE_MAXS;

/**
 * 测试App拦截功能
 */
public class AppClassFileTransformer implements ClassFileTransformer {
    @Override
    public byte[] transform(final ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain,
                            byte[] classfileBuffer) {
        if ("App".equals(className)) {
            ClassReader cr = new ClassReader(classfileBuffer);
            ClassWriter cw = new ClassWriter(cr, COMPUTE_FRAMES | COMPUTE_MAXS);

            cr.accept(new MyClassVistor(), EXPAND_FRAMES);

            return cw.toByteArray();
        }

        return classfileBuffer;
    }
}
