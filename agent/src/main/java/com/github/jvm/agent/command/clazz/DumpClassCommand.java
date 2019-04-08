package com.github.jvm.agent.command.clazz;

import com.github.jvm.agent.advisor.Enhancer;
import com.github.jvm.agent.command.GeneralCommand;
import com.github.jvm.agent.util.Constants;
import com.github.jvm.agent.util.StringUtils;
import com.github.jvm.agent.util.TypeRenderUtils;
import com.github.jvm.agent.util.affect.RowAffect;
import com.github.jvm.agent.util.command.SearchUtils;
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

import java.io.File;
import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;
import java.util.Map;
import java.util.Set;

import static com.taobao.text.ui.Element.label;

/**
 * Dump class byte array
 */
@Name("dump")
@Summary("Dump class byte array from JVM")
@Slf4j
@Description(Constants.EXAMPLE +
        "  dump -E org\\\\.apache\\\\.commons\\\\.lang\\\\.StringUtils\n" +
        "  dump org.apache.commons.lang.StringUtils\n" +
        "  dump org/apache/commons/lang/StringUtils\n" +
        "  dump *StringUtils\n")
public class DumpClassCommand extends GeneralCommand {
    private String classPattern;
    private String code = null;
    private boolean isRegEx = false;

    @Argument(index = 0, argName = "class-pattern")
    @Description("Class name pattern, use either '.' or '/' as separator")
    public void setClassPattern(String classPattern) {
        this.classPattern = classPattern;
    }

    @Option(shortName = "c", longName = "code")
    @Description("The hash code of the special class's classLoader")
    public void setCode(String code) {
        this.code = code;
    }

    @Option(shortName = "E", longName = "regex")
    @Description("Enable regular expression to match (wildcard matching by default)")
    public void setRegEx(boolean regEx) {
        isRegEx = regEx;
    }

    public DumpClassCommand(TtyConnection conn, Instrumentation inst) {
        super(conn, inst);
    }

    @Override
    public void process(Consumer<int[]> out) {
        RowAffect effect = new RowAffect();

        if (helpFlag) {
            writeHelpInfo(DumpClassCommand.class);
        } else {
            Set<Class<?>> matchedClasses = SearchUtils.searchClass(inst, classPattern, isRegEx, code);

            try {
                if (matchedClasses == null || matchedClasses.isEmpty()) {
                    processNoMatch(conn);
                } else if (matchedClasses.size() > 5) {
                    processMatches(conn, matchedClasses);
                } else {
                    processMatch(conn, effect, inst, matchedClasses);
                }
            } finally {
                conn.write(effect + "\n");
            }
        }
    }

    private void processMatch(TtyConnection conn, RowAffect effect, Instrumentation inst, Set<Class<?>> matchedClasses) {
        try {
            Map<Class<?>, File> classFiles = dump(inst, matchedClasses);
            TableElement table = new TableElement().leftCellPadding(1).rightCellPadding(1);
            table.row(new LabelElement("HASHCODE").style(Decoration.bold.bold()),
                    new LabelElement("CLASSLOADER").style(Decoration.bold.bold()),
                    new LabelElement("LOCATION").style(Decoration.bold.bold()));

            for (Map.Entry<Class<?>, File> entry : classFiles.entrySet()) {
                Class<?> clazz = entry.getKey();
                File file = entry.getValue();
                table.row(label(StringUtils.classLoaderHash(clazz)).style(Decoration.bold.fg(Color.red)),
                        TypeRenderUtils.drawClassLoader(clazz),
                        label(file.getCanonicalPath()).style(Decoration.bold.fg(Color.red)));
            }

            conn.write(RenderUtil.render(table, 120)).write(Constants.EMPTY_STRING);
            effect.rCnt(classFiles.keySet().size());
        } catch (Throwable t) {
            log.error("dump: fail to dump classes: " + matchedClasses, t);
        }
    }

    private Map<Class<?>, File> dump(Instrumentation inst, Set<Class<?>> classes) throws UnmodifiableClassException {
        ClassDumpTransformer transformer = new ClassDumpTransformer(classes);
        Enhancer.enhance(inst, transformer, classes);
        return transformer.getDumpResult();
    }

    private void processMatches(TtyConnection conn, Set<Class<?>> matchedClasses) {
        Element usage = new LabelElement("dump -c hashcode " + classPattern).style(Decoration.bold.fg(Color.blue));
        conn.write("Found more than 5 class for: " + classPattern + ", Please use ");
        conn.write(RenderUtil.render(usage, 120));

        TableElement table = new TableElement().leftCellPadding(1).rightCellPadding(1);
        table.row(new LabelElement("NAME").style(Decoration.bold.bold()),
                new LabelElement("HASHCODE").style(Decoration.bold.bold()),
                new LabelElement("CLASSLOADER").style(Decoration.bold.bold()));

        for (Class<?> c : matchedClasses) {
            table.row(label(c.getName()), label(StringUtils.classLoaderHash(c)).style(Decoration.bold.fg(Color.red)),
                    TypeRenderUtils.drawClassLoader(c));
        }

        conn.write(RenderUtil.render(table, 120) + "\n");
    }

    private void processNoMatch(TtyConnection conn) {
        conn.write("No class found for: " + classPattern + "\n");
    }
}
