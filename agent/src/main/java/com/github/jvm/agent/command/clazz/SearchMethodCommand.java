package com.github.jvm.agent.command.clazz;

import com.github.jvm.agent.command.GeneralCommand;
import com.github.jvm.agent.util.Constants;
import com.github.jvm.agent.util.usage.StyledUsageFormatter;
import com.taobao.middleware.cli.annotations.*;
import com.taobao.text.Color;
import io.termd.core.function.Consumer;
import io.termd.core.tty.TtyConnection;

import java.lang.instrument.Instrumentation;

@Name("sm")
@Summary("Search the method of classes loaded by JVM")
@Description(Constants.EXAMPLE +
        "  sm -Ed org\\\\.apache\\\\.commons\\\\.lang\\.StringUtils .*\n" +
        "  sm org.apache.commons.????.StringUtils *\n" +
        "  sm -d org.apache.commons.lang.StringUtils\n" +
        "  sm -d org/apache/commons/lang/StringUtils\n" +
        "  sm *String????s *\n")
public class SearchMethodCommand extends GeneralCommand {
    private String classPattern;
    private String methodPattern;
    private boolean isDetail = false;
    private boolean isRegEx = false;

    @Argument(argName = "class-pattern", index = 0)
    @Description("Class name pattern, use either '.' or '/' as separator")
    public void setClassPattern(String classPattern) {
        this.classPattern = classPattern;
    }

    @Argument(argName = "method-pattern", index = 1, required = false)
    @Description("Method name pattern")
    public void setMethodPattern(String methodPattern) {
        this.methodPattern = methodPattern;
    }

    @Option(shortName = "d", longName = "details", flag = true)
    @Description("Display the details of method")
    public void setDetail(boolean detail) {
        isDetail = detail;
    }

    @Option(shortName = "E", longName = "regex", flag = true)
    @Description("Enable regular expression to match (wildcard matching by default)")
    public void setRegEx(boolean regEx) {
        isRegEx = regEx;
    }

    public SearchMethodCommand(TtyConnection conn, Instrumentation inst) {
        super(conn, inst);
    }

    @Override
    public void process(Consumer<int[]> out) {
        if (classPattern != null) {
//            Set<Class<?>> matchedClasses = SearchUtils.searchClass(inst, classPattern, isRegEx);
//
//            for (Class<?> matchedClass : matchedClasses) {
//                if (isDetail) {
//                    conn.write(RenderUtil.render(renderClassInfo(matchedClass, isField), 120) + "\n");
//                } else {
//                    conn.write(matchedClass.getName() + "\n");
//                }
//            }
        } else if (helpFlag) {
            StyledUsageFormatter formatter = new StyledUsageFormatter(Color.green);
            formatter.setWidth(100);
            StringBuilder usage = new StringBuilder();
            formatter.usageMsg(usage, SearchMethodCommand.class);

            conn.write(usage.toString());
        }
    }
}
