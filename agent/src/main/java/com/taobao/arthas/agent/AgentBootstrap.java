package com.taobao.arthas.agent;

import lombok.extern.slf4j.Slf4j;

import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.arraycopy;

/**
 * 探针boorstrap类
 */

@Slf4j
public class AgentBootstrap {

    /**
     * 以 -javaagent 的方式启动
     *
     * @param args
     * @param inst
     */
    public static void premain(String args, Instrumentation inst) {
        main(args, inst);
    }

    /**
     * 以 attach 的方式启动
     *
     * @param args
     * @param inst
     */
    public static void agentmain(String args, Instrumentation inst) {
        main(args, inst);
    }

    private static void main(String args, Instrumentation inst) {
        AppClassFileTransformer appClassFileTransformer = new AppClassFileTransformer();

        //统计需要字节码加强的类集
        Set<Class<?>> enhanceClassSet = new HashSet<Class<?>>();
        Class[] allLoadedClasses = inst.getAllLoadedClasses();
        for (Class clazz : allLoadedClasses) {
            String name = clazz.getName();

            if ("App".equals(name)) {
                enhanceClassSet.add(clazz);
            }
        }

        try {
            inst.addTransformer(appClassFileTransformer);

            final int size = enhanceClassSet.size();
            final Class<?>[] classArray = new Class<?>[size];
            arraycopy(enhanceClassSet.toArray(), 0, classArray, 0, size);
            if (classArray.length > 0) {
                System.out.println("000000000000000000000000000000");
                System.out.println("000000000000000000000000000000");
                System.out.println("000000000000000000000000000000");
                System.out.println("000000000000000000000000000000");
                log.info("start to batch transform classes: " + Arrays.toString(classArray));
                inst.retransformClasses(classArray);
                log.info("Success to batch transform classes: " + Arrays.toString(classArray));
                System.out.println("1111111111111111111111111111");
                System.out.println("1111111111111111111111111111");
                System.out.println("1111111111111111111111111111");
                System.out.println("1111111111111111111111111111");
                System.out.println("1111111111111111111111111111");
            }
        } catch (UnmodifiableClassException e) {
            e.printStackTrace();
        } finally {
            inst.removeTransformer(appClassFileTransformer);
        }
    }
}
