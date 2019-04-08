package com.github.jvm.agent.antlr;

import com.github.jvm.agent.command.Command;
import com.github.jvm.agent.command.basic.*;
import com.github.jvm.agent.command.clazz.*;
import com.github.jvm.agent.command.monitor.JvmCommand;
import com.github.jvm.agent.command.monitor.MonitorCommand;
import com.github.jvm.agent.command.monitor.ThreadCommand;
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
        visitHashcode(ctx.hashcode_flag());
        visitIncludeReflectionClassLoader(ctx.includeReflectionClassLoader_flag());
        visitResource(ctx.resource_flag());
        visitTree(ctx.tree_flag());
        visitList(ctx.list_flag());

        return super.visitClassloader_command(ctx);
    }

    @Override
    public Object visitJad_command(CommandParser.Jad_commandContext ctx) {
        command = new JadCommand(conn, inst);

        visitHashcode(ctx.hashcode_flag());
        visitRegexContext(ctx.regex_flag());
        visitClassPatternContext(ctx.class_pattern());
        visitMethodPatternContext(ctx.method_pattern());

        return super.visitJad_command(ctx);
    }

    @Override
    public Object visitGetstatic_command(CommandParser.Getstatic_commandContext ctx) {
        command = new GetStaticCommand(conn, inst);

        visitHashcode(ctx.hashcode_flag());
        visitRegexContext(ctx.regex_flag());
        visitClassPatternContext(ctx.class_pattern());

        return super.visitGetstatic_command(ctx);
    }

    @Override
    public Object visitMonitor_command(CommandParser.Monitor_commandContext ctx) {
        command = new MonitorCommand(conn, inst);

        visitCycle(ctx.cycle_flag());
        visitRegexContext(ctx.regex_flag());
        visitNumberLimit(ctx.number_limit_flag());
        visitClassPatternContext(ctx.class_pattern());
        visitMethodPatternContext(ctx.method_pattern());

        return super.visitMonitor_command(ctx);
    }

    @Override
    public Object visitThread_command(CommandParser.Thread_commandContext ctx) {
        command = new ThreadCommand(conn, inst);

        CommandParser.Top_N_Busy_flagContext top_n_busy_flagContext = ctx.top_N_Busy_flag();
        if (top_n_busy_flagContext != null) {
            command.setTopNBusy(Integer.parseInt(top_n_busy_flagContext.getChild(2).getText()));
        }
        CommandParser.Find_most_blockingthread_flagContext most_blockingthread_flag = ctx.find_most_blockingthread_flag();
        if (most_blockingthread_flag != null) {
            command.setFindMostBlockingThread(true);
        }
        CommandParser.SetSampleInterval_flagContext setSampleInterval_flagContext = ctx.setSampleInterval_flag();
        if (setSampleInterval_flagContext != null) {
            command.setSampleInterval(Integer.parseInt(setSampleInterval_flagContext.getChild(2).getText()));
        }
        CommandParser.IdContext id = ctx.id();
        if (id != null) {
            command.setId(Integer.parseInt(id.any_name().getText()));
        }

        return super.visitThread_command(ctx);
    }

    @Override
    public Object visitJvm_command(CommandParser.Jvm_commandContext ctx) {
        command = new JvmCommand(conn);

        return super.visitJvm_command(ctx);
    }

    @Override
    public Object visitDump_command(CommandParser.Dump_commandContext ctx) {
        command = new DumpClassCommand(conn, inst);

        visitHashcode(ctx.hashcode_flag());
        visitRegexContext(ctx.regex_flag());
        visitClassPatternContext(ctx.class_pattern());

        return super.visitDump_command(ctx);
    }

    @Override
    public Object visitReset_command(CommandParser.Reset_commandContext ctx) {
        command = new ResetCommand(conn, inst);

        visitRegexContext(ctx.regex_flag());
        visitClassPatternContext(ctx.class_pattern());

        return super.visitReset_command(ctx);
    }

    private void visitNumberLimit(CommandParser.Number_limit_flagContext number_limit_flagContext) {
        if (number_limit_flagContext != null) {
            command.setNumberOfLimit(Integer.parseInt(number_limit_flagContext.getChild(1).getText()));
        }
    }

    /**
     * 访问 -c cycle 统计周期
     *
     * @param cycle_flagContext
     */
    private void visitCycle(CommandParser.Cycle_flagContext cycle_flagContext) {
        if (cycle_flagContext != null) {
            command.setCycle(Integer.parseInt(cycle_flagContext.getChild(1).getText()));
        }
    }

    @Override
    public Object visitExpress_pattern(CommandParser.Express_patternContext ctx) {
        if (ctx != null) {
            String express = ctx.any_name().getText();
            command.setExpress(express);
        }

        return super.visitExpress_pattern(ctx);
    }

    @Override
    public Object visitField_pattern(CommandParser.Field_patternContext ctx) {
        if (ctx != null) {
            String fieldPattern = ctx.any_name().getText();
            command.setFieldPattern(fieldPattern);
        }

        return super.visitField_pattern(ctx);
    }

    /**
     * 访问 -l
     *
     * @param list_flagContext
     */
    private void visitList(CommandParser.List_flagContext list_flagContext) {
        if (list_flagContext != null) {
            command.setListClassLoader(true);
        }
    }

    /**
     * 访问 -t
     *
     * @param tree_flagContext
     */
    private void visitTree(CommandParser.Tree_flagContext tree_flagContext) {
        if (tree_flagContext != null) {
            command.setTree(true);
        }
    }

    /**
     * 访问 -r <value>
     *
     * @param resource_flagContext
     */
    private void visitResource(CommandParser.Resource_flagContext resource_flagContext) {
        if (resource_flagContext != null) {
            command.setResource(resource_flagContext.getChild(2).getText());
        }
    }

    /**
     * 访问 -i
     *
     * @param includeReflectionClassLoader_flagContext
     */
    private void visitIncludeReflectionClassLoader(CommandParser.IncludeReflectionClassLoader_flagContext includeReflectionClassLoader_flagContext) {
        if (includeReflectionClassLoader_flagContext != null) {
            command.setIncludeReflectionClassLoader(true);
        }
    }

    /**
     * 访问 -c hashcode
     *
     * @param hashcode_flagContext
     */
    private void visitHashcode(CommandParser.Hashcode_flagContext hashcode_flagContext) {
        if (hashcode_flagContext != null) {
            command.setHashCode(hashcode_flagContext.getChild(2).getText());
        }
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
