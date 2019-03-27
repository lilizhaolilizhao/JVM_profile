package com.github.jvm.agent.util;

import com.github.jvm.agent.command.Command;
import com.github.jvm.agent.command.basic.ClsCommand;
import com.github.jvm.agent.command.basic.ExitCommand;
import com.github.jvm.agent.command.basic.HelpCommand;
import com.github.jvm.agent.command.basic.KeymapCommand;
import com.github.jvm.agent.command.clazz.SearchClassCommand;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

public class CommandParseUtilTest {

    @Test
    public void clsCommandTest() {
        String commandText = "cls";
        Command command = CommandParseUtil.parseCommand(null, commandText);

        Assert.assertTrue(command instanceof ClsCommand);
    }

    @Test
    public void helpCommandTest() {
        String commandText = "help";
        Command command = CommandParseUtil.parseCommand(null, commandText);

        Assert.assertTrue(command instanceof HelpCommand);
    }

    @Test
    public void exitCommandTest() {
        String commandText = "quit";
        Command command = CommandParseUtil.parseCommand(null, commandText);

        Assert.assertTrue(command instanceof ExitCommand);
    }

    @Test
    public void keymapCommandTest() {
        String commandText = "keymap";
        Command command = CommandParseUtil.parseCommand(null, commandText);

        Assert.assertTrue(command instanceof KeymapCommand);
    }

    @Test
    public void scCommandTest() {
        String commandText = "sc";
        Command command = CommandParseUtil.parseCommand(null, commandText);

        Assert.assertTrue(command instanceof SearchClassCommand);
        Assert.assertFalse(((SearchClassCommand) command).isHelpFlag());

        commandText = "sc -help";
        command = CommandParseUtil.parseCommand(null, commandText);

        Assert.assertTrue(command instanceof SearchClassCommand);
        Assert.assertTrue(((SearchClassCommand) command).isHelpFlag());

        commandText = "sc sun.reflect.generics.scope.MethodScope";
        command = CommandParseUtil.parseCommand(null, commandText);
        Assert.assertTrue(command instanceof SearchClassCommand);

        try {
            Field classPatternField = SearchClassCommand.class.getDeclaredField("classPattern");
            classPatternField.setAccessible(true);
            Object o = classPatternField.get(command);

            Assert.assertEquals("sun.reflect.generics.scope.MethodScope", o);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
