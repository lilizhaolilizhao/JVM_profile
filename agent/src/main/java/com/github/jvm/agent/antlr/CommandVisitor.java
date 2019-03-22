package com.github.jvm.agent.antlr;// Generated from /Users/oneapm/git/JVM_profile/agent/src/main/antlr/Command.g4 by ANTLR 4.7.2

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
}