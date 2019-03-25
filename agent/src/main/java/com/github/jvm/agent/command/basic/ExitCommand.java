package com.github.jvm.agent.command.basic;

import com.github.jvm.agent.command.Command;
import com.taobao.middleware.cli.annotations.Name;
import com.taobao.middleware.cli.annotations.Summary;
import io.termd.core.function.Consumer;
import io.termd.core.tty.TtyConnection;

/**
 * 推出命令
 */
@Name("exit")
@Summary("Exit the screen")
public class ExitCommand implements Command {
    private TtyConnection conn;

    public ExitCommand(TtyConnection conn) {
        this.conn = conn;
    }

    @Override
    public void process(Consumer<int[]> out) {
        conn.close();
    }
}
