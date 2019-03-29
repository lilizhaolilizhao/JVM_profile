// Generated from /Users/oneapm/git/JVM_profile/agent/src/main/antlr/Command.g4 by ANTLR 4.7.2
package com.github.jvm.agent.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CommandParser}.
 */
public interface CommandListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link CommandParser#parse}.
     *
     * @param ctx the parse tree
     */
    void enterParse(CommandParser.ParseContext ctx);

    /**
     * Exit a parse tree produced by {@link CommandParser#parse}.
     *
     * @param ctx the parse tree
     */
    void exitParse(CommandParser.ParseContext ctx);

    /**
     * Enter a parse tree produced by {@link CommandParser#command_list}.
     *
     * @param ctx the parse tree
     */
    void enterCommand_list(CommandParser.Command_listContext ctx);

    /**
     * Exit a parse tree produced by {@link CommandParser#command_list}.
     *
     * @param ctx the parse tree
     */
    void exitCommand_list(CommandParser.Command_listContext ctx);

    /**
     * Enter a parse tree produced by {@link CommandParser#help_command}.
     *
     * @param ctx the parse tree
     */
    void enterHelp_command(CommandParser.Help_commandContext ctx);

    /**
     * Exit a parse tree produced by {@link CommandParser#help_command}.
     *
     * @param ctx the parse tree
     */
    void exitHelp_command(CommandParser.Help_commandContext ctx);

    /**
     * Enter a parse tree produced by {@link CommandParser#sc_command}.
     *
     * @param ctx the parse tree
     */
    void enterSc_command(CommandParser.Sc_commandContext ctx);

    /**
     * Exit a parse tree produced by {@link CommandParser#sc_command}.
     *
     * @param ctx the parse tree
     */
    void exitSc_command(CommandParser.Sc_commandContext ctx);

    /**
     * Enter a parse tree produced by {@link CommandParser#sm_command}.
     *
     * @param ctx the parse tree
     */
    void enterSm_command(CommandParser.Sm_commandContext ctx);

    /**
     * Exit a parse tree produced by {@link CommandParser#sm_command}.
     *
     * @param ctx the parse tree
     */
    void exitSm_command(CommandParser.Sm_commandContext ctx);

    /**
     * Enter a parse tree produced by {@link CommandParser#classloader_command}.
     *
     * @param ctx the parse tree
     */
    void enterClassloader_command(CommandParser.Classloader_commandContext ctx);

    /**
     * Exit a parse tree produced by {@link CommandParser#classloader_command}.
     *
     * @param ctx the parse tree
     */
    void exitClassloader_command(CommandParser.Classloader_commandContext ctx);

    /**
     * Enter a parse tree produced by {@link CommandParser#keymap_command}.
     *
     * @param ctx the parse tree
     */
    void enterKeymap_command(CommandParser.Keymap_commandContext ctx);

    /**
     * Exit a parse tree produced by {@link CommandParser#keymap_command}.
     *
     * @param ctx the parse tree
     */
    void exitKeymap_command(CommandParser.Keymap_commandContext ctx);

    /**
     * Enter a parse tree produced by {@link CommandParser#exit_command}.
     *
     * @param ctx the parse tree
     */
    void enterExit_command(CommandParser.Exit_commandContext ctx);

    /**
     * Exit a parse tree produced by {@link CommandParser#exit_command}.
     *
     * @param ctx the parse tree
     */
    void exitExit_command(CommandParser.Exit_commandContext ctx);

    /**
     * Enter a parse tree produced by {@link CommandParser#cls_command}.
     *
     * @param ctx the parse tree
     */
    void enterCls_command(CommandParser.Cls_commandContext ctx);

    /**
     * Exit a parse tree produced by {@link CommandParser#cls_command}.
     *
     * @param ctx the parse tree
     */
    void exitCls_command(CommandParser.Cls_commandContext ctx);

    /**
     * Enter a parse tree produced by {@link CommandParser#general_help}.
     *
     * @param ctx the parse tree
     */
    void enterGeneral_help(CommandParser.General_helpContext ctx);

    /**
     * Exit a parse tree produced by {@link CommandParser#general_help}.
     *
     * @param ctx the parse tree
     */
    void exitGeneral_help(CommandParser.General_helpContext ctx);

    /**
     * Enter a parse tree produced by {@link CommandParser#field_flag}.
     *
     * @param ctx the parse tree
     */
    void enterField_flag(CommandParser.Field_flagContext ctx);

    /**
     * Exit a parse tree produced by {@link CommandParser#field_flag}.
     *
     * @param ctx the parse tree
     */
    void exitField_flag(CommandParser.Field_flagContext ctx);

    /**
     * Enter a parse tree produced by {@link CommandParser#resource_flag}.
     *
     * @param ctx the parse tree
     */
    void enterResource_flag(CommandParser.Resource_flagContext ctx);

    /**
     * Exit a parse tree produced by {@link CommandParser#resource_flag}.
     *
     * @param ctx the parse tree
     */
    void exitResource_flag(CommandParser.Resource_flagContext ctx);

    /**
     * Enter a parse tree produced by {@link CommandParser#tree_flag}.
     *
     * @param ctx the parse tree
     */
    void enterTree_flag(CommandParser.Tree_flagContext ctx);

    /**
     * Exit a parse tree produced by {@link CommandParser#tree_flag}.
     *
     * @param ctx the parse tree
     */
    void exitTree_flag(CommandParser.Tree_flagContext ctx);

    /**
     * Enter a parse tree produced by {@link CommandParser#list_flag}.
     *
     * @param ctx the parse tree
     */
    void enterList_flag(CommandParser.List_flagContext ctx);

    /**
     * Exit a parse tree produced by {@link CommandParser#list_flag}.
     *
     * @param ctx the parse tree
     */
    void exitList_flag(CommandParser.List_flagContext ctx);

    /**
     * Enter a parse tree produced by {@link CommandParser#regex_flag}.
     *
     * @param ctx the parse tree
     */
    void enterRegex_flag(CommandParser.Regex_flagContext ctx);

    /**
     * Exit a parse tree produced by {@link CommandParser#regex_flag}.
     *
     * @param ctx the parse tree
     */
    void exitRegex_flag(CommandParser.Regex_flagContext ctx);

    /**
     * Enter a parse tree produced by {@link CommandParser#extend_flag}.
     *
     * @param ctx the parse tree
     */
    void enterExtend_flag(CommandParser.Extend_flagContext ctx);

    /**
     * Exit a parse tree produced by {@link CommandParser#extend_flag}.
     *
     * @param ctx the parse tree
     */
    void exitExtend_flag(CommandParser.Extend_flagContext ctx);

    /**
     * Enter a parse tree produced by {@link CommandParser#hashcode_flag}.
     *
     * @param ctx the parse tree
     */
    void enterHashcode_flag(CommandParser.Hashcode_flagContext ctx);

    /**
     * Exit a parse tree produced by {@link CommandParser#hashcode_flag}.
     *
     * @param ctx the parse tree
     */
    void exitHashcode_flag(CommandParser.Hashcode_flagContext ctx);

    /**
     * Enter a parse tree produced by {@link CommandParser#includeReflectionClassLoader_flag}.
     *
     * @param ctx the parse tree
     */
    void enterIncludeReflectionClassLoader_flag(CommandParser.IncludeReflectionClassLoader_flagContext ctx);

    /**
     * Exit a parse tree produced by {@link CommandParser#includeReflectionClassLoader_flag}.
     *
     * @param ctx the parse tree
     */
    void exitIncludeReflectionClassLoader_flag(CommandParser.IncludeReflectionClassLoader_flagContext ctx);

    /**
     * Enter a parse tree produced by {@link CommandParser#detail_flag}.
     *
     * @param ctx the parse tree
     */
    void enterDetail_flag(CommandParser.Detail_flagContext ctx);

    /**
     * Exit a parse tree produced by {@link CommandParser#detail_flag}.
     *
     * @param ctx the parse tree
     */
    void exitDetail_flag(CommandParser.Detail_flagContext ctx);

    /**
     * Enter a parse tree produced by {@link CommandParser#all_flag}.
     *
     * @param ctx the parse tree
     */
    void enterAll_flag(CommandParser.All_flagContext ctx);

    /**
     * Exit a parse tree produced by {@link CommandParser#all_flag}.
     *
     * @param ctx the parse tree
     */
    void exitAll_flag(CommandParser.All_flagContext ctx);

    /**
     * Enter a parse tree produced by {@link CommandParser#class_pattern}.
     *
     * @param ctx the parse tree
     */
    void enterClass_pattern(CommandParser.Class_patternContext ctx);

    /**
     * Exit a parse tree produced by {@link CommandParser#class_pattern}.
     *
     * @param ctx the parse tree
     */
    void exitClass_pattern(CommandParser.Class_patternContext ctx);

    /**
     * Enter a parse tree produced by {@link CommandParser#method_pattern}.
     *
     * @param ctx the parse tree
     */
    void enterMethod_pattern(CommandParser.Method_patternContext ctx);

    /**
     * Exit a parse tree produced by {@link CommandParser#method_pattern}.
     *
     * @param ctx the parse tree
     */
    void exitMethod_pattern(CommandParser.Method_patternContext ctx);

    /**
     * Enter a parse tree produced by {@link CommandParser#any_name}.
     *
     * @param ctx the parse tree
     */
    void enterAny_name(CommandParser.Any_nameContext ctx);

    /**
     * Exit a parse tree produced by {@link CommandParser#any_name}.
     *
     * @param ctx the parse tree
     */
    void exitAny_name(CommandParser.Any_nameContext ctx);
}