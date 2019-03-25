package com.github.jvm.agent.command;

import io.termd.core.function.Consumer;

public interface Command {
    void setHelpFlag(boolean helpFlag);

    void process(Consumer<int[]> out);
}
