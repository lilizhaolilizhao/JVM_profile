package com.github.jvm.agent.command;

import com.github.jvm.agent.shell.term.TermServer;
import com.github.jvm.agent.util.usage.StyledUsageFormatter;
import com.taobao.middleware.cli.annotations.Description;
import com.taobao.middleware.cli.annotations.Option;
import com.taobao.text.Color;
import io.termd.core.function.Consumer;
import io.termd.core.tty.TtyConnection;
import lombok.Data;

import java.lang.instrument.Instrumentation;

/**
 * 通用命令处理
 */
@Data
public abstract class GeneralCommand implements Command {
    protected boolean helpFlag = false;
    protected TtyConnection conn;
    protected Instrumentation inst;
    protected TermServer term;

    public GeneralCommand(TtyConnection conn) {
        this.conn = conn;
    }

    public GeneralCommand(TtyConnection conn, Instrumentation inst) {
        this.conn = conn;
        this.inst = inst;
    }

    public GeneralCommand(TtyConnection conn, Instrumentation inst, TermServer term) {
        this.conn = conn;
        this.inst = inst;
        this.term = term;
    }

    public void setSampleInterval(int sampleInterval) {
    }

    public void setFindMostBlockingThread(boolean findMostBlockingThread) {
    }

    public void setTopNBusy(Integer topNBusy) {
    }

    public void setId(long id) {
    }

    public void setNumberOfLimit(int numberOfLimit) {
    }

    public void setCycle(int cycle) {
    }

    public void setExpress(String express) {
    }

    public void setFieldPattern(String fieldPattern) {
    }

    public void setListClassLoader(boolean listClassLoader) {
    }

    public void setTree(boolean tree) {
    }

    public void setResource(String resource) {
    }

    public void setIncludeReflectionClassLoader(boolean includeReflectionClassLoader) {
    }

    public void setHashCode(String hashCode) {
    }

    public void setAll(boolean all) {
    }

    @Override
    public void setExpand(Integer expand) {
    }

    @Override
    public void setRegEx(boolean regEx) {
    }

    @Override
    public void setField(boolean field) {
    }

    @Override
    public void setDetail(boolean detail) {
    }


    @Override
    public void setClassPattern(String classPattern) {
    }

    @Override
    public void setMethodPattern(String methodPattern) {
    }

    @Override
    @Option(shortName = "h", longName = "help", flag = true)
    @Description("this help")
    public void setHelpFlag(boolean helpFlag) {
        this.helpFlag = helpFlag;
    }

    @Override
    public abstract void process(Consumer<int[]> out);

    protected void writeHelpInfo(Class<? extends Command> clazz) {
        writeHelpInfo(clazz, 100);
    }

    protected void writeHelpInfo(Class<? extends Command> clazz, int width) {
        StyledUsageFormatter formatter = new StyledUsageFormatter(Color.green);
        formatter.setWidth(width);
        StringBuilder usage = new StringBuilder();
        formatter.usageMsg(usage, clazz);

        conn.write(usage.toString());
    }
}
