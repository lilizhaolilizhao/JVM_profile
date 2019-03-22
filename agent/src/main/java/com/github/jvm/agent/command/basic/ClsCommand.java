package com.github.jvm.agent.command.basic;

import com.github.jvm.agent.command.Command;
import com.taobao.text.util.RenderUtil;
import io.termd.core.function.Consumer;
import io.termd.core.tty.TtyConnection;

/**
 * cls命令
 */
public class ClsCommand implements Command {
    private TtyConnection conn;

    public ClsCommand(TtyConnection conn) {
        this.conn = conn;
    }

    @Override
    public void proecss(Consumer<int[]> out) {
        conn.write(RenderUtil.cls());
    }
}
