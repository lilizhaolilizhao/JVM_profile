package com.github.jvm.agent.handlers.shell;

import com.github.jvm.agent.handlers.Handler;
import com.github.jvm.agent.shell.term.impl.TelnetTermServer;

public class ShellLineHandler implements Handler<String> {

    public ShellLineHandler() {
    }

    public ShellLineHandler(TelnetTermServer telnetTermServer) {

    }

    @Override
    public void handle(String line) {
        if (line == null) {
            return;
        }

        return;
    }
}
