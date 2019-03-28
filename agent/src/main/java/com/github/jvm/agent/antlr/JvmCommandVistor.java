package com.github.jvm.agent.antlr;

import com.github.jvm.agent.command.Command;
import com.github.jvm.agent.command.basic.ClsCommand;
import com.github.jvm.agent.command.basic.ExitCommand;
import com.github.jvm.agent.command.basic.HelpCommand;
import com.github.jvm.agent.command.basic.KeymapCommand;
import com.github.jvm.agent.command.clazz.ClassLoaderCommand;
import com.github.jvm.agent.command.clazz.SearchClassCommand;
import com.github.jvm.agent.command.clazz.SearchMethodCommand;
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

        visitDetailContext(ctx.detail_flag());
        visitFieldContext(ctx.field_flag());
        visitRegexContext(ctx.regex_flag());
        visitExtendContext(ctx.extend_flag());
        visitClassPatternContext(ctx.class_pattern());

        return super.visitSc_command(ctx);
    }

    @Override
    public Object visitSm_command(CommandParser.Sm_commandContext ctx) {
        command = new SearchMethodCommand(conn, inst);

        visitDetailContext(ctx.detail_flag());
        visitRegexContext(ctx.regex_flag());
        visitClassPatternContext(ctx.class_pattern());
        visitMethodPatternContext(ctx.method_pattern());

        return super.visitSm_command(ctx);
    }

    @Override
    public Object visitClassloader_command(CommandParser.Classloader_commandContext ctx) {
        command = new ClassLoaderCommand(conn, inst);

        visitAllFlag(ctx.all_flag());

        return super.visitClassloader_command(ctx);
    }

    /**
     * 访问 -a 标记
     *
     * @param all_flagContext
     */
    private void visitAllFlag(CommandParser.All_flagContext all_flagContext) {
        if (all_flagContext != null) {
            command.setAll(true);
        }
    }

    /**
     * 访问 -x 展开级别
     *
     * @param extend_flagContext
     */
    private void visitExtendContext(CommandParser.Extend_flagContext extend_flagContext) {
        if (extend_flagContext != null) {
            String extendLevel = extend_flagContext.getChild(2).getText();
            command.setExpand(Integer.parseInt(extendLevel));
        }
    }

    /**
     * 访问 -f 显示字段
     *
     * @param field_flagContext
     */
    private void visitFieldContext(CommandParser.Field_flagContext field_flagContext) {
        if (field_flagContext != null) {
            command.setField(true);
        }
    }

    /**
     * 访问 method_pattern
     *
     * @param method_patternContext
     */
    private void visitMethodPatternContext(CommandParser.Method_patternContext method_patternContext) {
        if (method_patternContext != null) {
            String methodPattern = method_patternContext.any_name().getText();
            command.setMethodPattern(methodPattern);
        }
    }

    /**
     * 访问 class_pattern
     *
     * @param class_patternContext
     */
    private void visitClassPatternContext(CommandParser.Class_patternContext class_patternContext) {
        if (class_patternContext != null) {
            String classPattern = class_patternContext.any_name().getText();
            command.setClassPattern(classPattern);
        }
    }

    /**
     * 访问 -e 是否正则
     *
     * @param regex_flagContext
     */
    private void visitRegexContext(CommandParser.Regex_flagContext regex_flagContext) {
        if (regex_flagContext != null) {
            command.setRegEx(true);
        }
    }

    /**
     * 访问 -d 显示详情
     *
     * @param detail_flagContext
     */
    private void visitDetailContext(CommandParser.Detail_flagContext detail_flagContext) {
        if (detail_flagContext != null) {
            command.setDetail(true);
        }
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
