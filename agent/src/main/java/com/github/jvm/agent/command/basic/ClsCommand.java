package com.github.jvm.agent.command.basic;

import com.github.jvm.agent.command.Command;
import com.taobao.middleware.cli.annotations.Name;
import com.taobao.middleware.cli.annotations.Summary;
import com.taobao.text.util.RenderUtil;
import io.termd.core.function.Consumer;
import io.termd.core.tty.TtyConnection;

/**
 * cls命令
 */
@Name("cls")
@Summary("Clear the screen")
public class ClsCommand implements Command {
    private TtyConnection conn;

    public ClsCommand(TtyConnection conn) {
        this.conn = conn;
    }

    @Override
    public void process(Consumer<int[]> out) {
        conn.write(RenderUtil.cls());
    }
}
