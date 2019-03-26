package com.github.jvm.agent.command;

import io.termd.core.function.Consumer;

public interface Command {
    void setClassPattern(String classPattern);

    void setHelpFlag(boolean helpFlag);

    void process(Consumer<int[]> out);
}
