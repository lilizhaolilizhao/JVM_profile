package com.github.jvm.agent.shell.term.impl;

import com.github.jvm.agent.handlers.Handler;
import com.github.jvm.agent.shell.term.TermServer;
import com.github.jvm.agent.shell.util.Helper;
import io.termd.core.function.Consumer;
import io.termd.core.tty.TtyConnection;

/**
 * @author beiwei30 on 23/11/2016.
 */
public class RequestHandler implements Consumer<String> {
    private TermServer term;
    private TtyConnection conn;
    private final Handler<String> lineHandler;

    public RequestHandler(TermServer term, TtyConnection conn, Handler<String> lineHandler) {
        this.term = term;
        this.conn = conn;
        this.lineHandler = lineHandler;
    }

    @Override
    public void accept(String line) {
        term.setInReadline(false);
        Consumer<int[]> out = conn.stdoutHandler();

        String text = "==================this is a test==================";
        Helper.echoMsg(out, text + "\n");
        term.readline(conn);

        lineHandler.handle(line);
    }
}
