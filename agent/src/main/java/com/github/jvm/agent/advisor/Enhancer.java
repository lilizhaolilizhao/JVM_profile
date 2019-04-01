package com.github.jvm.agent.advisor;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;
import java.util.Set;

import static java.lang.System.arraycopy;

/**
 * 对类进行通知增强
 */
public class Enhancer {

    // 批量增强
    public static void enhance(Instrumentation inst, ClassFileTransformer transformer, Set<Class<?>> classes)
            throws UnmodifiableClassException {
        try {
            inst.addTransformer(transformer, true);
            int size = classes.size();
            Class<?>[] classArray = new Class<?>[size];
            arraycopy(classes.toArray(), 0, classArray, 0, size);
            if (classArray.length > 0) {
                inst.retransformClasses(classArray);
            }
        } finally {
            inst.removeTransformer(transformer);
        }
    }
}
