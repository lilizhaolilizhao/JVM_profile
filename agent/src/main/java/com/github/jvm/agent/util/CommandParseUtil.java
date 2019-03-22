package com.github.jvm.agent.util;

import com.github.jvm.agent.antlr.CommandLexer;
import com.github.jvm.agent.antlr.CommandParser;
import com.github.jvm.agent.antlr.JvmCommandVistor;
import com.github.jvm.agent.command.Command;
import io.termd.core.tty.TtyConnection;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * 命令解析工具
 */
public class CommandParseUtil {

    /**
     * 解析命令行
     *
     * @param conn
     * @param commandText
     * @return
     */
    public static Command parseCommand(TtyConnection conn, String commandText) {
        ANTLRInputStream input = new ANTLRInputStream(commandText);
        CommandLexer lexer = new CommandLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CommandParser parser = new CommandParser(tokens);

        ParseTree tree = parser.parse();
        JvmCommandVistor commandVisitor = new JvmCommandVistor(conn);
        commandVisitor.visit(tree);

        return commandVisitor.getCommand();
    }
}
