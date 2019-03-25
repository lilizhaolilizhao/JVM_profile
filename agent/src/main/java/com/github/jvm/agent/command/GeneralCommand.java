package com.github.jvm.agent.command;

import io.termd.core.function.Consumer;
import io.termd.core.tty.TtyConnection;
import lombok.Data;

/**
 * 通用命令处理
 */
@Data
public abstract class GeneralCommand implements Command {
    protected boolean helpFlag = false;
    protected TtyConnection conn;

    public GeneralCommand(TtyConnection conn) {
        this.conn = conn;
    }

    @Override
    public void setHelpFlag(boolean helpFlag) {
        this.helpFlag = helpFlag;
    }

    @Override
    public abstract void process(Consumer<int[]> out);
}
