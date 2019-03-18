package com.github.jvm.agent.shell.term;

import com.github.jvm.agent.shell.future.Future;
import com.github.jvm.agent.shell.handlers.Handler;
import io.termd.core.function.Consumer;
import io.termd.core.telnet.netty.NettyTelnetTtyBootstrap;
import io.termd.core.tty.TtyConnection;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * 建立telnet服务端
 */
@Slf4j
public class TelnetTermServer {
    private NettyTelnetTtyBootstrap bootstrap;
    private String hostIp;
    private int port;
    private long connectionTimeout;

    private Handler<TelnetTermServer> termHandler;

    public TelnetTermServer(String hostIp, int port, long connectionTimeout) {
        this.hostIp = hostIp;
        this.port = port;
        this.connectionTimeout = connectionTimeout;
    }

    public TelnetTermServer termHandler(Handler<TelnetTermServer> handler) {
        termHandler = handler;
        return this;
    }

    public TelnetTermServer listen(Handler<Future<TelnetTermServer>> listenHandler) {
        bootstrap = new NettyTelnetTtyBootstrap().setHost(hostIp).setPort(port);
        try {
            bootstrap.start(new Consumer<TtyConnection>() {
                @Override
                public void accept(TtyConnection ttyConnection) {
                    System.out.println("this is a test!");
                }
            }).get(connectionTimeout, TimeUnit.MILLISECONDS);
            listenHandler.handle(Future.<TelnetTermServer>succeededFuture());
        } catch (Throwable t) {
            log.error("Error listening to port " + port, t);
            listenHandler.handle(Future.<TelnetTermServer>failedFuture(t));
        }

        return this;
    }
}
