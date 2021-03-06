// Generated from /Users/oneapm/git/JVM_profile/agent/src/main/antlr/Command.g4 by ANTLR 4.7.2
package com.github.jvm.agent.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CommandParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface CommandVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link CommandParser#parse}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParse(CommandParser.ParseContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#command_list}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCommand_list(CommandParser.Command_listContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#help_command}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitHelp_command(CommandParser.Help_commandContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#sc_command}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSc_command(CommandParser.Sc_commandContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#sm_command}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSm_command(CommandParser.Sm_commandContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#jad_command}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitJad_command(CommandParser.Jad_commandContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#getstatic_command}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGetstatic_command(CommandParser.Getstatic_commandContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#sysprop_command}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSysprop_command(CommandParser.Sysprop_commandContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#dump_command}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDump_command(CommandParser.Dump_commandContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#reset_command}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReset_command(CommandParser.Reset_commandContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#shut_command}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitShut_command(CommandParser.Shut_commandContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#monitor_command}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMonitor_command(CommandParser.Monitor_commandContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#redefine_command}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRedefine_command(CommandParser.Redefine_commandContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#thread_command}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitThread_command(CommandParser.Thread_commandContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#jvm_command}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitJvm_command(CommandParser.Jvm_commandContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#classloader_command}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitClassloader_command(CommandParser.Classloader_commandContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#keymap_command}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitKeymap_command(CommandParser.Keymap_commandContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#exit_command}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExit_command(CommandParser.Exit_commandContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#cls_command}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCls_command(CommandParser.Cls_commandContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#general_help}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGeneral_help(CommandParser.General_helpContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#field_flag}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitField_flag(CommandParser.Field_flagContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#resource_flag}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitResource_flag(CommandParser.Resource_flagContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#tree_flag}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTree_flag(CommandParser.Tree_flagContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#list_flag}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitList_flag(CommandParser.List_flagContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#regex_flag}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRegex_flag(CommandParser.Regex_flagContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#find_most_blockingthread_flag}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFind_most_blockingthread_flag(CommandParser.Find_most_blockingthread_flagContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#extend_flag}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExtend_flag(CommandParser.Extend_flagContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#hashcode_flag}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitHashcode_flag(CommandParser.Hashcode_flagContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#number_limit_flag}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNumber_limit_flag(CommandParser.Number_limit_flagContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#cycle_flag}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCycle_flag(CommandParser.Cycle_flagContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#path_pattern}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPath_pattern(CommandParser.Path_patternContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#top_N_Busy_flag}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTop_N_Busy_flag(CommandParser.Top_N_Busy_flagContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#setSampleInterval_flag}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSetSampleInterval_flag(CommandParser.SetSampleInterval_flagContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#includeReflectionClassLoader_flag}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIncludeReflectionClassLoader_flag(CommandParser.IncludeReflectionClassLoader_flagContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#detail_flag}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDetail_flag(CommandParser.Detail_flagContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#all_flag}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAll_flag(CommandParser.All_flagContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#class_pattern}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitClass_pattern(CommandParser.Class_patternContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#property_name}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitProperty_name(CommandParser.Property_nameContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#property_value}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitProperty_value(CommandParser.Property_valueContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#field_pattern}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitField_pattern(CommandParser.Field_patternContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#express_pattern}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpress_pattern(CommandParser.Express_patternContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#id}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitId(CommandParser.IdContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#method_pattern}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMethod_pattern(CommandParser.Method_patternContext ctx);

    /**
     * Visit a parse tree produced by {@link CommandParser#any_name}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAny_name(CommandParser.Any_nameContext ctx);
}