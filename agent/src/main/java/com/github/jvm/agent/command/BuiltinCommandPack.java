package com.github.jvm.agent.command;

import com.github.jvm.agent.command.basic.ClsCommand;
import com.github.jvm.agent.command.basic.ExitCommand;
import com.github.jvm.agent.command.basic.HelpCommand;
import com.github.jvm.agent.command.basic.KeymapCommand;
import com.github.jvm.agent.command.clazz.SearchClassCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * 内建命令
 */
public class BuiltinCommandPack {
    private static List<Class<? extends Command>> commands = new ArrayList<Class<? extends Command>>();

    static {
        initCommands();
    }

    public static List<Class<? extends Command>> getCommands() {
        return commands;
    }

    private static void initCommands() {
        commands.add(HelpCommand.class);
        commands.add(KeymapCommand.class);
        commands.add(SearchClassCommand.class);
        commands.add(ClsCommand.class);
        commands.add(ExitCommand.class);
    }
}
