package com.github.jvm.agent.command.clazz;

import com.github.jvm.agent.command.GeneralCommand;
import com.github.jvm.agent.util.Constants;
import com.github.jvm.agent.util.StringUtils;
import com.github.jvm.agent.util.TypeRenderUtils;
import com.github.jvm.agent.util.command.SearchUtils;
import com.github.jvm.agent.util.matcher.Matcher;
import com.github.jvm.agent.util.matcher.RegexMatcher;
import com.github.jvm.agent.util.matcher.WildcardMatcher;
import com.github.jvm.agent.util.usage.StyledUsageFormatter;
import com.taobao.middleware.cli.annotations.*;
import com.taobao.text.Color;
import com.taobao.text.ui.Element;
import com.taobao.text.ui.TableElement;
import com.taobao.text.util.RenderUtil;
import io.termd.core.function.Consumer;
import io.termd.core.tty.TtyConnection;

import java.lang.instrument.Instrumentation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

import static com.taobao.text.Decoration.bold;
import static com.taobao.text.ui.Element.label;
import static java.lang.String.format;

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
            Matcher<String> methodNameMatcher = methodNameMatcher();
            Set<Class<?>> matchedClasses = SearchUtils.searchClass(inst, classPattern, isRegEx);

            for (Class<?> clazz : matchedClasses) {
                Set<String> methodNames = new HashSet<String>();
                for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
                    if (!methodNameMatcher.matching("<init>")) {
                        continue;
                    }

                    if (isDetail) {
                        conn.write(RenderUtil.render(renderConstructor(constructor), 120) + "\n");
                    } else {
                        if (methodNames.contains("<init>")) {
                            continue;
                        }
                        methodNames.add("<init>");
                        String line = format("%s->%s%n", clazz.getName(), "<init>");
                        conn.write(line);
                    }
                }

                for (Method method : clazz.getDeclaredMethods()) {
                    if (!methodNameMatcher.matching(method.getName())) {
                        continue;
                    }

                    if (isDetail) {
                        conn.write(RenderUtil.render(renderMethod(method), 120) + "\n");
                    } else {
                        if (methodNames.contains(method.getName())) {
                            continue;
                        }
                        methodNames.add(method.getName());
                        String line = format("%s->%s%n", clazz.getName(), method.getName());
                        conn.write(line);
                    }
                }
            }
        } else if (helpFlag) {
            StyledUsageFormatter formatter = new StyledUsageFormatter(Color.green);
            formatter.setWidth(100);
            StringBuilder usage = new StringBuilder();
            formatter.usageMsg(usage, SearchMethodCommand.class);

            conn.write(usage.toString());
        }
    }


    private Element renderMethod(Method method) {
        TableElement table = new TableElement().leftCellPadding(1).rightCellPadding(1);

        table.row(label("declaring-class").style(bold.bold()), label(method.getDeclaringClass().getName()))
                .row(label("method-name").style(bold.bold()), label(method.getName()).style(bold.bold()))
                .row(label("modifier").style(bold.bold()), label(StringUtils.modifier(method.getModifiers(), ',')))
                .row(label("annotation").style(bold.bold()), label(TypeRenderUtils.drawAnnotation(method)))
                .row(label("parameters").style(bold.bold()), label(TypeRenderUtils.drawParameters(method)))
                .row(label("return").style(bold.bold()), label(TypeRenderUtils.drawReturn(method)))
                .row(label("exceptions").style(bold.bold()), label(TypeRenderUtils.drawExceptions(method)));
        return table;
    }

    private Element renderConstructor(Constructor constructor) {
        TableElement table = new TableElement().leftCellPadding(1).rightCellPadding(1);

        table.row(label("declaring-class").style(bold.bold()), label(constructor.getDeclaringClass().getName()))
                .row(label("constructor-name").style(bold.bold()), label("<init>").style(bold.bold()))
                .row(label("modifier").style(bold.bold()), label(StringUtils.modifier(constructor.getModifiers(), ',')))
                .row(label("annotation").style(bold.bold()), label(TypeRenderUtils.drawAnnotation(constructor.getDeclaredAnnotations())))
                .row(label("parameters").style(bold.bold()), label(TypeRenderUtils.drawParameters(constructor)))
                .row(label("exceptions").style(bold.bold()), label(TypeRenderUtils.drawExceptions(constructor)));
        return table;
    }

    /**
     * @return
     */
    private Matcher<String> methodNameMatcher() {
        // auto fix default methodPattern
        if (StringUtils.isBlank(methodPattern)) {
            methodPattern = isRegEx ? ".*" : "*";
        }
        return isRegEx ? new RegexMatcher(methodPattern) : new WildcardMatcher(methodPattern);
    }
}
