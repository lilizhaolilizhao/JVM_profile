package com.github.jvm.agent.command;

import io.termd.core.function.Consumer;

public interface Command {
    void setIncludeReflectionClassLoader(boolean includeReflectionClassLoader);

    void setHashCode(String hashCode);

    void setAll(boolean all);

    void setExpand(Integer expand);

    void setRegEx(boolean regEx);

    void setField(boolean field);

    void setDetail(boolean detail);

    void setClassPattern(String classPattern);

    void setMethodPattern(String methodPattern);

    void setHelpFlag(boolean helpFlag);

    void process(Consumer<int[]> out);
}
