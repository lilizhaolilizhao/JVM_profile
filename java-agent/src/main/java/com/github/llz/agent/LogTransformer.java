package com.github.llz.agent;

import com.github.llz.transformer.GeneralMethodAdapter;
import com.github.llz.transformer.TomcatTransformer;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

import java.lang.instrument.ClassFileTransformer;
import java.security.ProtectionDomain;

public class LogTransformer implements ClassFileTransformer {
    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain,
                            byte[] classfileBuffer) {
        try {
            ClassReader cr = new ClassReader(classfileBuffer);
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);

            GeneralMethodAdapter timeCountAdpter = new TomcatTransformer(cw);
            cr.accept(timeCountAdpter, ClassReader.EXPAND_FRAMES);

            return cw.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return classfileBuffer;
    }
}
