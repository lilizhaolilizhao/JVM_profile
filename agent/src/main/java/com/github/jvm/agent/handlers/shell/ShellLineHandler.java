package com.github.jvm.agent.handlers.shell;

import com.github.jvm.agent.handlers.Handler;

public class ShellLineHandler implements Handler<String> {
    @Override
    public void handle(String line) {
        if (line == null) {
            return;
        }

        return;
    }
}
