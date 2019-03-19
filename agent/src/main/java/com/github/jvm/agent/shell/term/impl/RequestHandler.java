package com.github.jvm.agent.shell.term.impl;

import com.github.jvm.agent.handlers.Handler;
import com.github.jvm.agent.shell.term.TermServer;
import io.termd.core.function.Consumer;

/**
 * @author beiwei30 on 23/11/2016.
 */
public class RequestHandler implements Consumer<String> {
    private TermServer term;
    private final Handler<String> lineHandler;

    public RequestHandler(TermServer term, Handler<String> lineHandler) {
        this.term = term;
        this.lineHandler = lineHandler;
    }

    @Override
    public void accept(String line) {
        term.setInReadline(false);
        lineHandler.handle(line);
    }
}
