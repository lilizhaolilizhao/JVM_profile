package com.github.jvm.agent.shell.term;

import io.termd.core.telnet.netty.NettyTelnetTtyBootstrap;

/**
 * 建立telnet服务端
 */
public class TelnetTermServer {
    private NettyTelnetTtyBootstrap bootstrap;
    private String hostIp;
    private int port;
    private long connectionTimeout;

    public TelnetTermServer(String hostIp, int port, long connectionTimeout) {
        this.hostIp = hostIp;
        this.port = port;
        this.connectionTimeout = connectionTimeout;
    }


}
