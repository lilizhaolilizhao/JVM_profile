package com.github.jvm.agent.antlr;// Generated from /Users/oneapm/git/JVM_profile/agent/src/main/antlr/Command.g4 by ANTLR 4.7.2

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link CommandVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public class CommandBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements CommandVisitor<T> {
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitParse(CommandParser.ParseContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitCommand_list(CommandParser.Command_listContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitHelp_command(CommandParser.Help_commandContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitCls_command(CommandParser.Cls_commandContext ctx) {
        return visitChildren(ctx);
    }
}