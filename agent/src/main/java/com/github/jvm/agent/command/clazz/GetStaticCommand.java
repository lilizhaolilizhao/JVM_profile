package com.github.jvm.agent.command.clazz;

import com.github.jvm.agent.command.GeneralCommand;
import com.github.jvm.agent.util.Constants;
import com.github.jvm.agent.util.StringUtils;
import com.github.jvm.agent.util.TypeRenderUtils;
import com.github.jvm.agent.util.affect.RowAffect;
import com.github.jvm.agent.util.command.SearchUtils;
import com.github.jvm.agent.util.matcher.Matcher;
import com.github.jvm.agent.util.matcher.RegexMatcher;
import com.github.jvm.agent.util.matcher.WildcardMatcher;
import com.github.jvm.agent.view.ObjectView;
import com.taobao.middleware.cli.annotations.*;
import com.taobao.text.Color;
import com.taobao.text.Decoration;
import com.taobao.text.ui.Element;
import com.taobao.text.ui.LabelElement;
import com.taobao.text.ui.TableElement;
import com.taobao.text.util.RenderUtil;
import io.termd.core.function.Consumer;
import io.termd.core.tty.TtyConnection;
import lombok.extern.slf4j.Slf4j;

import java.lang.instrument.Instrumentation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Set;

import static com.taobao.text.ui.Element.label;

@Name("getstatic")
@Summary("Show the static field of a class")
@Description(Constants.EXAMPLE + "  getstatic -c 39eb305e org.apache.log4j.LogManager DEFAULT_CONFIGURATION_FILE\n")
@Slf4j
public class GetStaticCommand extends GeneralCommand {
    private String classPattern;
    private String fieldPattern;
    private String express;
    private String code = null;
    private boolean isRegEx = false;
    private int expand = 1;

    @Argument(argName = "class-pattern", index = 0)
    @Description("Class name pattern, use either '.' or '/' as separator")
    public void setClassPattern(String classPattern) {
        this.classPattern = classPattern;
    }

    @Argument(argName = "field-pattern", index = 1)
    @Description("Field name pattern")
    public void setFieldPattern(String fieldPattern) {
        this.fieldPattern = fieldPattern;
    }

    @Argument(argName = "express", index = 2, required = false)
    @Description("the content you want to watch, written by ognl")
    public void setExpress(String express) {
        this.express = express;
    }

    @Option(shortName = "c", longName = "code")
    @Description("The hash code of the special class's classLoader")
    public void setHashCode(String hashCode) {
        this.code = hashCode;
    }

    @Option(shortName = "E", longName = "regex", flag = true)
    @Description("Enable regular expression to match (wildcard matching by default)")
    public void setRegEx(boolean regEx) {
        isRegEx = regEx;
    }

    @Option(shortName = "x", longName = "expand")
    @Description("Expand level of object (1 by default)")
    public void setExpand(Integer expand) {
        this.expand = expand;
    }

    public GetStaticCommand(TtyConnection conn, Instrumentation inst) {
        super(conn, inst);
    }

    @Override
    public void process(Consumer<int[]> out) {
        RowAffect affect = new RowAffect();

        Set<Class<?>> matchedClasses = SearchUtils.searchClassOnly(inst, classPattern, isRegEx, code);
        try {
            if (matchedClasses == null || matchedClasses.isEmpty()) {
                conn.write("No class found for: " + classPattern + "\n");
            } else if (matchedClasses.size() > 1) {
                processMatches(conn, matchedClasses);
            } else {
                processExactMatch(conn, affect, inst, matchedClasses);
            }
        } finally {
            conn.write(affect + "\n");
        }
    }

    private void processExactMatch(TtyConnection conn, RowAffect affect, Instrumentation inst,
                                   Set<Class<?>> matchedClasses) {
        Matcher<String> fieldNameMatcher = fieldNameMatcher();

        Class<?> clazz = matchedClasses.iterator().next();

        boolean found = false;
        for (Field field : clazz.getDeclaredFields()) {
            if (!Modifier.isStatic(field.getModifiers()) || !fieldNameMatcher.matching(field.getName())) {
                continue;
            }

            if (!field.isAccessible()) {
                field.setAccessible(true);
            }

            try {
                Object value = field.get(null);

//                if (!StringUtils.isEmpty(express)) {
//                    value = ExpressFactory.newExpress(value).get(express);
//                }

                String result = StringUtils.objectToString(expand >= 0 ? new ObjectView(value, expand).draw() : value);
                conn.write("field: " + field.getName() + "\n" + result + "\n");

                affect.rCnt(1);
            } catch (IllegalAccessException e) {
                log.warn("getstatic: failed to get static value, class: " + clazz + ", field: " + field.getName(),
                        e);
                conn.write("Failed to get static, exception message: " + e.getMessage()
                        + ", please check $HOME/logs/arthas/arthas.log for more details. \n");
//            } catch (ExpressException e) {
                log.warn("getstatic: failed to get express value, class: " + clazz + ", field: " + field.getName()
                        + ", express: " + express, e);
                conn.write("Failed to get static, exception message: " + e.getMessage()
                        + ", please check $HOME/logs/arthas/arthas.log for more details. \n");
            } finally {
                found = true;
            }
        }
    }

    private Matcher<String> fieldNameMatcher() {
        return isRegEx ? new RegexMatcher(fieldPattern) : new WildcardMatcher(fieldPattern);
    }

    private void processMatches(TtyConnection conn, Set<Class<?>> matchedClasses) {
        Element usage = new LabelElement("getstatic -c <hashcode> " + classPattern + " " + fieldPattern).style(
                Decoration.bold.fg(Color.blue));
        conn.write("\n Found more than one class for: " + classPattern + ", Please use " + RenderUtil.render(usage,
                120));

        TableElement table = new TableElement().leftCellPadding(1).rightCellPadding(1);
        table.row(new LabelElement("HASHCODE").style(Decoration.bold.bold()),
                new LabelElement("CLASSLOADER").style(Decoration.bold.bold()));

        for (Class<?> c : matchedClasses) {
            ClassLoader classLoader = c.getClassLoader();
            table.row(label(Integer.toHexString(classLoader.hashCode())).style(Decoration.bold.fg(Color.red)),
                    TypeRenderUtils.drawClassLoader(c));
        }

        conn.write(RenderUtil.render(table, 120) + "\n");
    }
}
