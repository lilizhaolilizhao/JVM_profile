package com.github.jvm.agent.command.klass;

import com.github.jvm.agent.command.GeneralCommand;
import com.github.jvm.agent.util.Constants;
import com.github.jvm.agent.util.usage.StyledUsageFormatter;
import com.taobao.middleware.cli.annotations.Description;
import com.taobao.middleware.cli.annotations.Name;
import com.taobao.middleware.cli.annotations.Summary;
import com.taobao.text.Color;
import io.termd.core.function.Consumer;
import io.termd.core.tty.TtyConnection;

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
public class SearchClassCommand extends GeneralCommand {
    public SearchClassCommand(TtyConnection conn) {
        super(conn);
    }

    @Override
    public void process(Consumer<int[]> out) {
        if (helpFlag) {
            StyledUsageFormatter formatter = new StyledUsageFormatter(Color.green);
            formatter.setWidth(100);
            StringBuilder usage = new StringBuilder();
            formatter.usageMsg(usage, SearchClassCommand.class);

            conn.write(usage.toString());
        }
    }
}
