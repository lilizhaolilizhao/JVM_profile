package com.github.jvm.agent.shell.term.impl;

import com.github.jvm.agent.command.Command;
import com.github.jvm.agent.handlers.Handler;
import com.github.jvm.agent.shell.term.TermServer;
import com.github.jvm.agent.util.CommandParseUtil;
import io.termd.core.function.Consumer;
import io.termd.core.tty.TtyConnection;

/**
 * 请求处理
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

        Command command = CommandParseUtil.parseCommand(line);
        command.proecss(out);

        term.readline(conn);
        lineHandler.handle(line);
    }
}
