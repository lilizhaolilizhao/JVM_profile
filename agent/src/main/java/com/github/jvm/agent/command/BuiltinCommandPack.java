package com.github.jvm.agent.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 内建命令
 */
public class BuiltinCommandPack {
    private static List<Command> commands = new ArrayList<Command>();

    static {
        initCommands();
    }

    public List<Command> commands() {
        return commands;
    }

    private static void initCommands() {
        //TODO
//        commands.add();
    }
}
