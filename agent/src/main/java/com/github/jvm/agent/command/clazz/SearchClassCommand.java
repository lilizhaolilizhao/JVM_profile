package com.github.jvm.agent.command.clazz;

import com.github.jvm.agent.command.GeneralCommand;
import com.github.jvm.agent.util.Constants;
import com.github.jvm.agent.util.StringUtils;
import com.github.jvm.agent.util.TypeRenderUtils;
import com.github.jvm.agent.util.command.SearchUtils;
import com.github.jvm.agent.util.usage.StyledUsageFormatter;
import com.taobao.middleware.cli.annotations.*;
import com.taobao.text.Color;
import com.taobao.text.Decoration;
import com.taobao.text.ui.Element;
import com.taobao.text.ui.TableElement;
import com.taobao.text.util.RenderUtil;
import io.termd.core.function.Consumer;
import io.termd.core.tty.TtyConnection;

import java.lang.instrument.Instrumentation;
import java.security.CodeSource;
import java.util.Set;

import static com.taobao.text.ui.Element.label;

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
    private String classPattern;
    private boolean isDetail = false;
    private boolean isField = false;
    private boolean isRegEx = false;
    private Integer expand;

    @Argument(argName = "class-pattern", index = 0)
    @Description("Class name pattern, use either '.' or '/' as separator")
    public void setClassPattern(String classPattern) {
        this.classPattern = classPattern;
    }

    @Option(shortName = "d", longName = "details", flag = true)
    @Description("Display the details of class")
    public void setDetail(boolean detail) {
        isDetail = detail;
    }

    @Option(shortName = "f", longName = "field", flag = true)
    @Description("Display all the member variables")
    public void setField(boolean field) {
        isField = field;
    }

    @Option(shortName = "E", longName = "regex", flag = true)
    @Description("Enable regular expression to match (wildcard matching by default)")
    public void setRegEx(boolean regEx) {
        isRegEx = regEx;
    }

    @Option(shortName = "x", longName = "expand")
    @Description("Expand level of object (0 by default)")
    public void setExpand(Integer expand) {
        this.expand = expand;
    }

    public SearchClassCommand(TtyConnection conn, Instrumentation inst) {
        super(conn, inst);
    }

    @Override
    public void process(Consumer<int[]> out) {
        if (classPattern != null) {
            Set<Class<?>> matchedClasses = SearchUtils.searchClass(inst, classPattern, isRegEx);

            for (Class<?> matchedClass : matchedClasses) {
                if (isDetail) {
                    conn.write(RenderUtil.render(renderClassInfo(matchedClass, isField), 120) + "\n");
                } else {
                    conn.write(matchedClass.getName() + "\n");
                }
            }
        } else if (helpFlag) {
            StyledUsageFormatter formatter = new StyledUsageFormatter(Color.green);
            formatter.setWidth(100);
            StringBuilder usage = new StringBuilder();
            formatter.usageMsg(usage, SearchClassCommand.class);

            conn.write(usage.toString());
        }
    }

    private Element renderClassInfo(Class<?> clazz, boolean isPrintField) {
        TableElement table = new TableElement().leftCellPadding(1).rightCellPadding(1);
        CodeSource cs = clazz.getProtectionDomain().getCodeSource();

        table.row(label("class-info").style(Decoration.bold.bold()), label(StringUtils.classname(clazz)))
                .row(label("code-source").style(Decoration.bold.bold()), label(getCodeSource(cs)))
                .row(label("name").style(Decoration.bold.bold()), label(StringUtils.classname(clazz)))
                .row(label("isInterface").style(Decoration.bold.bold()), label("" + clazz.isInterface()))
                .row(label("isAnnotation").style(Decoration.bold.bold()), label("" + clazz.isAnnotation()))
                .row(label("isEnum").style(Decoration.bold.bold()), label("" + clazz.isEnum()))
                .row(label("isAnonymousClass").style(Decoration.bold.bold()), label("" + clazz.isAnonymousClass()))
                .row(label("isArray").style(Decoration.bold.bold()), label("" + clazz.isArray()))
                .row(label("isLocalClass").style(Decoration.bold.bold()), label("" + clazz.isLocalClass()))
                .row(label("isMemberClass").style(Decoration.bold.bold()), label("" + clazz.isMemberClass()))
                .row(label("isPrimitive").style(Decoration.bold.bold()), label("" + clazz.isPrimitive()))
                .row(label("isSynthetic").style(Decoration.bold.bold()), label("" + clazz.isSynthetic()))
                .row(label("simple-name").style(Decoration.bold.bold()), label(clazz.getSimpleName()))
                .row(label("modifier").style(Decoration.bold.bold()), label(StringUtils.modifier(clazz.getModifiers(), ',')))
                .row(label("annotation").style(Decoration.bold.bold()), label(TypeRenderUtils.drawAnnotation(clazz)))
                .row(label("interfaces").style(Decoration.bold.bold()), label(TypeRenderUtils.drawInterface(clazz)))
                .row(label("super-class").style(Decoration.bold.bold()), TypeRenderUtils.drawSuperClass(clazz))
                .row(label("class-loader").style(Decoration.bold.bold()), TypeRenderUtils.drawClassLoader(clazz))
                .row(label("classLoaderHash").style(Decoration.bold.bold()), label(StringUtils.classLoaderHash(clazz)));

        if (isPrintField) {
            table.row(label("fields"), TypeRenderUtils.drawField(clazz, expand));
        }
        return table;
    }

    public static String getCodeSource(final CodeSource cs) {
        if (null == cs || null == cs.getLocation() || null == cs.getLocation().getFile()) {
            return Constants.EMPTY_STRING;
        }

        return cs.getLocation().getFile();
    }
}
