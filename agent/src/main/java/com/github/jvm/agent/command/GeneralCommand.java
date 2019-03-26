package com.github.jvm.agent.command;

import com.taobao.middleware.cli.annotations.Description;
import com.taobao.middleware.cli.annotations.Option;
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
    @Option(shortName = "h", longName = "help", flag = true)
    @Description("this help")
    public void setHelpFlag(boolean helpFlag) {
        this.helpFlag = helpFlag;
    }

    @Override
    public abstract void process(Consumer<int[]> out);
}
