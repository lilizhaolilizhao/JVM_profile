package com.github.jvm.agent.shell.term.impl;

import com.github.jvm.agent.handlers.Handler;
import com.github.jvm.agent.handlers.shell.ShellLineHandler;
import com.github.jvm.agent.shell.future.Future;
import com.github.jvm.agent.shell.term.TermServer;
import com.github.jvm.agent.shell.util.Helper;
import com.github.jvm.agent.util.Constants;
import io.termd.core.function.Consumer;
import io.termd.core.readline.Readline;
import io.termd.core.telnet.netty.NettyTelnetTtyBootstrap;
import io.termd.core.tty.TtyConnection;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * 建立telnet服务端
 */
@Slf4j
public class TelnetTermServer extends TermServer {
    private Readline readline;
    private NettyTelnetTtyBootstrap bootstrap;
    private String hostIp;
    private int port;
    private long connectionTimeout;
    private boolean inReadline;
    private String welcomeText;

    public void setWelcomeText(String welcomeText) {
        this.welcomeText = welcomeText;
    }

    public TelnetTermServer(String hostIp, int port, long connectionTimeout) {
        this.hostIp = hostIp;
        this.port = port;
        this.connectionTimeout = connectionTimeout;

        readline = new Readline(Helper.loadKeymap());
    }

    public TelnetTermServer listen(Handler<Future<TelnetTermServer>> listenHandler) {
        bootstrap = new NettyTelnetTtyBootstrap().setHost(hostIp).setPort(port);
        try {
            bootstrap.start(new Consumer<TtyConnection>() {
                @Override
                public void accept(TtyConnection conn) {
                    conn.write(welcomeText + "\n");

                    readline.readline(conn, Constants.DEFAULT_PROMPT, new RequestHandler(TelnetTermServer.this, conn, new ShellLineHandler()));
                }
            }).get(connectionTimeout, TimeUnit.MILLISECONDS);
            listenHandler.handle(Future.<TelnetTermServer>succeededFuture());
        } catch (Throwable t) {
            log.error("Error listening to port " + port, t);
            listenHandler.handle(Future.<TelnetTermServer>failedFuture(t));
        }

        return this;
    }

    @Override
    public void setInReadline(boolean inReadline) {
        this.inReadline = inReadline;
    }

    @Override
    public void readline(TtyConnection conn) {
        readline.readline(conn, Constants.DEFAULT_PROMPT, new RequestHandler(this, conn, new ShellLineHandler()));
    }
}
