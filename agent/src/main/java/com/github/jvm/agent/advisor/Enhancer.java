package com.github.jvm.agent.advisor;

import com.github.jvm.agent.util.affect.EnhancerAffect;
import com.github.jvm.agent.util.matcher.Matcher;
import lombok.extern.slf4j.Slf4j;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;
import java.security.ProtectionDomain;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

import static java.lang.System.arraycopy;

/**
 * 对类进行通知增强
 */
@Slf4j
public class Enhancer {

    // 类-字节码缓存
    private final static Map<Class<?>/*Class*/, byte[]/*bytes of Class*/> classBytesCache
            = new WeakHashMap<Class<?>, byte[]>();

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

    /**
     * 重置指定的Class
     *
     * @param inst             inst
     * @param classNameMatcher 类名匹配
     * @return 增强影响范围
     * @throws UnmodifiableClassException
     */
    public static synchronized EnhancerAffect reset(
            final Instrumentation inst,
            final Matcher classNameMatcher) throws UnmodifiableClassException {
        final EnhancerAffect affect = new EnhancerAffect();
        final Set<Class<?>> enhanceClassSet = new HashSet<Class<?>>();

        for (Class<?> classInCache : classBytesCache.keySet()) {
            if (classNameMatcher.matching(classInCache.getName())) {
                enhanceClassSet.add(classInCache);
            }
        }

        final ClassFileTransformer resetClassFileTransformer = new ClassFileTransformer() {
            @Override
            public byte[] transform(
                    ClassLoader loader,
                    String className,
                    Class<?> classBeingRedefined,
                    ProtectionDomain protectionDomain,
                    byte[] classfileBuffer) throws IllegalClassFormatException {
                return null;
            }
        };

        try {
            enhance(inst, resetClassFileTransformer, enhanceClassSet);
            log.info("Success to reset classes: " + enhanceClassSet);
        } finally {
            for (Class<?> resetClass : enhanceClassSet) {
                classBytesCache.remove(resetClass);
                affect.cCnt(1);

            }
        }

        return affect;
    }
}
