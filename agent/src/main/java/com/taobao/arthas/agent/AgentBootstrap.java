package com.taobao.arthas.agent;

import java.lang.instrument.Instrumentation;

/**
 * 探针boorstrap类
 */
public class AgentBootstrap {

    /**
     * 以 -javaagent 的方式启动
     * @param args
     * @param inst
     */
    public static void premain(String args, Instrumentation inst) {
        main(args, inst);
    }

    /**
     * 以 attach 的方式启动
     * @param args
     * @param inst
     */
    public static void agentmain(String args, Instrumentation inst) {
        main(args, inst);
    }

    private static void main(String args, Instrumentation inst) {
        System.out.println("====================");
        System.out.println(inst);
    }
}
