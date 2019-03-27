package com.github.jvm.agent.command;

import io.termd.core.function.Consumer;

public interface Command {
    void setRegEx(boolean regEx);

    void setField(boolean field);

    void setDetail(boolean detail);

    void setClassPattern(String classPattern);

    void setHelpFlag(boolean helpFlag);

    void process(Consumer<int[]> out);
}
