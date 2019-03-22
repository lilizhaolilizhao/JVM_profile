package com.github.jvm.agent.command.basic;

import com.github.jvm.agent.command.Command;
import com.github.jvm.agent.shell.util.Helper;
import io.termd.core.function.Consumer;

/**
 * cls命令
 */
public class ClsCommand implements Command {
    @Override
    public void proecss(Consumer<int[]> out) {
        String text = "This is cls command";
        Helper.echoMsg(out, text + "\n");
    }
}
