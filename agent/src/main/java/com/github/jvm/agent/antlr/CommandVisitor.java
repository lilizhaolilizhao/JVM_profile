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