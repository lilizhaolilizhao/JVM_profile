package com.github.jvm.agent.command.basic;

import com.github.jvm.agent.command.Command;
import io.termd.core.function.Consumer;
import io.termd.core.tty.TtyConnection;

/**
 * 推出命令
 */
public class ExitCommand implements Command {
    private TtyConnection conn;

    public ExitCommand(TtyConnection conn) {
        this.conn = conn;
    }

    @Override
    public void proecss(Consumer<int[]> out) {
        conn.close();
    }
}
