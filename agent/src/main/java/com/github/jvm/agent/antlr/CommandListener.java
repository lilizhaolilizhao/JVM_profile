package com.github.jvm.agent.antlr;// Generated from /Users/oneapm/git/JVM_profile/agent/src/main/antlr/Command.g4 by ANTLR 4.7.2

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
}