package com.github.jvm.agent.bootstrap;

import com.sun.tools.attach.VirtualMachine;
import com.sun.tools.attach.VirtualMachineDescriptor;
import com.github.jvm.agent.util.AgentLog;

import java.util.Properties;

public class AttachAgentMain {
    public static void main(String[] args) throws Exception {
        new AttachAgentMain().attachAgent(args[0]);
    }

    /**
     * attach程序
     *
     * @param javaPid
     * @throws Exception
     */
    private void attachAgent(String javaPid) throws Exception {
        VirtualMachineDescriptor virtualMachineDescriptor = null;
        for (VirtualMachineDescriptor descriptor : VirtualMachine.list()) {
            String pid = descriptor.id();
            if (pid.equals(javaPid)) {
                virtualMachineDescriptor = descriptor;
            }
        }
        VirtualMachine virtualMachine = null;
        try {
            if (null == virtualMachineDescriptor) {
                virtualMachine = VirtualMachine.attach(javaPid);
            } else {
                virtualMachine = VirtualMachine.attach(virtualMachineDescriptor);
            }

            Properties targetSystemProperties = virtualMachine.getSystemProperties();
            String targetJavaVersion = targetSystemProperties.getProperty("java.specification.version");
            String currentJavaVersion = System.getProperty("java.specification.version");
            if (targetJavaVersion != null && currentJavaVersion != null) {
                if (!targetJavaVersion.equals(currentJavaVersion)) {
                    AgentLog.warn("Current VM java version: {} do not match target VM java version: {}, attach may fail.",
                            currentJavaVersion, targetJavaVersion);
                    AgentLog.warn("Target VM JAVA_HOME is {}, try to set the same JAVA_HOME.",
                            targetSystemProperties.getProperty("java.home"));
                }
            }

            //接口说明 单个参数和两个参数
            //loadAgent(String agent)
            //loadAgent(String agent, String options)
            virtualMachine.loadAgent("agent/target/jvm-profile-agent-jar-with-dependencies.jar");
        } finally {
            if (null != virtualMachine) {
                virtualMachine.detach();
            }
        }
    }
}
