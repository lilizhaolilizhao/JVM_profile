package com.github.jvm.agent.command;

import io.termd.core.function.Consumer;

public interface Command {
    void proecss(Consumer<int[]> out);
}
