package com.github.jvm.agent.antlr;

import com.github.jvm.agent.command.Command;
import com.github.jvm.agent.command.basic.ClsCommand;
import com.github.jvm.agent.command.basic.HelpCommand;
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
    public Object visitCommand_list(CommandParser.Command_listContext ctx) {
        command = new HelpCommand();

        return super.visitCommand_list(ctx);
    }

    @Override
    public Object visitCls_command(CommandParser.Cls_commandContext ctx) {
        command = new ClsCommand(conn);

        return super.visitCls_command(ctx);
    }
}
