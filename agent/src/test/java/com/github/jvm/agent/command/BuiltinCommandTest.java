package com.github.jvm.agent.command;

import org.junit.Test;

import java.util.List;

public class BuiltinCommandTest {

    @Test
    public void getCommand() {
        List<Class<? extends Command>> commands = BuiltinCommandPack.getCommands();

        System.out.println(commands.size());
    }
}
