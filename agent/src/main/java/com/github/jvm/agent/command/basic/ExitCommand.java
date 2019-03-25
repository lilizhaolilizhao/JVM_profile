package com.github.jvm.agent.command.basic;

import com.github.jvm.agent.command.GeneralCommand;
import com.taobao.middleware.cli.annotations.Name;
import com.taobao.middleware.cli.annotations.Summary;
import io.termd.core.function.Consumer;
import io.termd.core.tty.TtyConnection;

/**
 * 退出命令
 */
@Name("exit")
@Summary("Exit the screen")
public class ExitCommand extends GeneralCommand {

    public ExitCommand(TtyConnection conn) {
        super(conn);
    }

    @Override
    public void process(Consumer<int[]> out) {
        conn.close();
    }
}
