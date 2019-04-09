package com.github.jvm.agent.shell.term.impl;

import com.github.jvm.agent.command.Command;
import com.github.jvm.agent.handlers.Handler;
import com.github.jvm.agent.shell.term.TermServer;
import com.github.jvm.agent.shell.util.Helper;
import com.github.jvm.agent.util.command.CommandParseUtil;
import io.termd.core.function.Consumer;
import io.termd.core.tty.TtyConnection;

import java.lang.instrument.Instrumentation;

/**
 * 请求处理
 */
public class RequestHandler implements Consumer<String> {
    private TermServer term;
    private TtyConnection conn;
    private final Handler<String> lineHandler;
    private Instrumentation inst;

    public RequestHandler(TermServer term, TtyConnection conn, Handler<String> lineHandler, Instrumentation inst) {
        this.term = term;
        this.conn = conn;
        this.lineHandler = lineHandler;
        this.inst = inst;
    }

    @Override
    public void accept(String line) {
        term.setInReadline(false);
        Consumer<int[]> out = conn.stdoutHandler();

        if (line != null && !"".equals(line.trim())) {
            try {
                Command command = CommandParseUtil.parseCommand(conn, inst, term, line);
                command.process(out);
            } catch (Exception e) {
                Helper.echoMsg(out, "命令格式异常:" + e.getMessage() + "\n");
            }
        }

        term.readline(conn);
        lineHandler.handle(line);
    }
}
