package com.taobao.arthas.agent;

import java.lang.instrument.ClassFileTransformer;
import java.security.ProtectionDomain;

/**
 * 测试App拦截功能
 */
public class AppClassFileTransformer implements ClassFileTransformer {
    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain,
                            byte[] classfileBuffer) {
        if ("App".equals(className)) {
            System.out.println("=========&&&&&&&&&&&&&============");
            System.out.println("=========&&&&&&&&&&&&&============");
            System.out.println("=========&&&&&&&&&&&&&============");
            System.out.println("=========&&&&&&&&&&&&&============");
            System.out.println("=========&&&&&&&&&&&&&============");
            System.out.println("=========&&&&&&&&&&&&&============");
        }
        return classfileBuffer;
    }
}
