package com.github.jvm.agent.antlr;

import com.github.jvm.agent.command.Command;
import com.github.jvm.agent.command.basic.ClsCommand;
import com.github.jvm.agent.command.basic.ExitCommand;
import com.github.jvm.agent.command.basic.HelpCommand;
import com.github.jvm.agent.command.basic.KeymapCommand;
import com.github.jvm.agent.command.klass.SearchClassCommand;
import io.termd.core.tty.TtyConnection;
import lombok.Data;

@Data
public class JvmCommandVistor extends CommandBaseVisitor {
    private TtyConnection conn;
    private Command command;

    public JvmCommandVistor(TtyConnection conn) {
        this.conn = conn;
    }

    @Override
    public Object visitHelp_command(CommandParser.Help_commandContext ctx) {
        command = new HelpCommand(conn);

        return super.visitHelp_command(ctx);
    }

    @Override
    public Object visitSc_command(CommandParser.Sc_commandContext ctx) {
        command = new SearchClassCommand(conn);

        return super.visitSc_command(ctx);
    }

    @Override
    public Object visitKeymap_command(CommandParser.Keymap_commandContext ctx) {
        command = new KeymapCommand(conn);

        return super.visitKeymap_command(ctx);
    }

    @Override
    public Object visitGeneral_help(CommandParser.General_helpContext ctx) {
        command.setHelpFlag(true);

        return super.visitGeneral_help(ctx);
    }

    @Override
    public Object visitExit_command(CommandParser.Exit_commandContext ctx) {
        command = new ExitCommand(conn);

        return super.visitExit_command(ctx);
    }

    @Override
    public Object visitCls_command(CommandParser.Cls_commandContext ctx) {
        command = new ClsCommand(conn);

        return super.visitCls_command(ctx);
    }
}
