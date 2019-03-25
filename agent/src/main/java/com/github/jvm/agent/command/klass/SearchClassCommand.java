package com.github.jvm.agent.command.klass;

import com.github.jvm.agent.command.Command;
import com.github.jvm.agent.util.Constants;
import com.taobao.middleware.cli.annotations.Description;
import com.taobao.middleware.cli.annotations.Name;
import com.taobao.middleware.cli.annotations.Summary;
import io.termd.core.function.Consumer;

/**
 * 展示相关类信息
 */
@Name("sc")
@Summary("Search all the classes loaded by JVM")
@Description(Constants.EXAMPLE +
        "  sc -E org\\\\.apache\\\\.commons\\\\.lang\\\\.StringUtils\n" +
        "  sc -d org.apache.commons.lang.StringUtils\n" +
        "  sc -d org/apache/commons/lang/StringUtils\n" +
        "  sc -d *StringUtils\n")
public class SearchClassCommand implements Command {
    @Override
    public void process(Consumer<int[]> out) {
        
    }
}
