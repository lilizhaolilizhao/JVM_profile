package com.github.jvm.agent.command.basic;

import com.github.jvm.agent.command.Command;
import com.github.jvm.agent.shell.util.Helper;
import io.termd.core.function.Consumer;

/**
 * 帮助命令
 */
public class HelpCommand implements Command {
    @Override
    public void proecss(Consumer<int[]> out) {
        String text = "This is help command";
        Helper.echoMsg(out, text + "\n");
    }
}
