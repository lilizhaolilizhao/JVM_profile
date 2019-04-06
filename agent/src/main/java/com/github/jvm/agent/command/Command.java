package com.github.jvm.agent.command;

import io.termd.core.function.Consumer;

public interface Command {

    public void setSampleInterval(int sampleInterval);

    void setFindMostBlockingThread(boolean findMostBlockingThread);

    void setTopNBusy(Integer topNBusy);

    void setId(long id);

    void setNumberOfLimit(int numberOfLimit);

    void setCycle(int cycle);

    void setListClassLoader(boolean listClassLoader);

    void setTree(boolean tree);

    void setResource(String resource);

    void setIncludeReflectionClassLoader(boolean includeReflectionClassLoader);

    void setHashCode(String hashCode);

    void setAll(boolean all);

    void setExpand(Integer expand);

    void setRegEx(boolean regEx);

    void setField(boolean field);

    void setDetail(boolean detail);

    void setClassPattern(String classPattern);

    void setFieldPattern(String fieldPattern);

    void setExpress(String express);

    void setMethodPattern(String methodPattern);

    void setHelpFlag(boolean helpFlag);

    void process(Consumer<int[]> out);
}
