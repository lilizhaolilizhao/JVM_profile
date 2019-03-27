package com.github.jvm.agent.antlr;

import com.github.jvm.agent.command.Command;
import com.github.jvm.agent.command.basic.ClsCommand;
import com.github.jvm.agent.command.basic.ExitCommand;
import com.github.jvm.agent.command.basic.HelpCommand;
import com.github.jvm.agent.command.basic.KeymapCommand;
import com.github.jvm.agent.command.clazz.SearchClassCommand;
import io.termd.core.tty.TtyConnection;
import lombok.Data;

import java.lang.instrument.Instrumentation;

@Data
public class JvmCommandVistor extends CommandBaseVisitor {
    private TtyConnection conn;
    private Instrumentation inst;
    private Command command;

    public JvmCommandVistor(TtyConnection conn, Instrumentation inst) {
        this.conn = conn;
        this.inst = inst;
    }

    @Override
    public Object visitHelp_command(CommandParser.Help_commandContext ctx) {
        command = new HelpCommand(conn);

        return super.visitHelp_command(ctx);
    }

    @Override
    public Object visitSc_command(CommandParser.Sc_commandContext ctx) {
        command = new SearchClassCommand(conn, inst);

        //访问 -d 显示详情
        CommandParser.Detail_flagContext detail_flagContext = ctx.detail_flag();
        if (detail_flagContext != null) {
            command.setDetail(true);
        }

        //访问 -f 显示字段
        CommandParser.Field_flagContext field_flagContext = ctx.field_flag();
        if (field_flagContext != null) {
            command.setField(true);
        }

        //访问 -e 是否正则
        CommandParser.Regex_flagContext regex_flagContext = ctx.regex_flag();
        if (regex_flagContext != null) {
            command.setRegEx(true);
        }

        //访问 class_pattern
        CommandParser.Class_patternContext classPatternContext = ctx.class_pattern();
        if (classPatternContext != null) {
            String classPattern = classPatternContext.any_name().getText();
            command.setClassPattern(classPattern);
        }

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
