package com.github.jvm.agent.command.clazz;

import com.github.jvm.agent.advisor.Enhancer;
import com.github.jvm.agent.command.GeneralCommand;
import com.github.jvm.agent.util.Constants;
import com.github.jvm.agent.util.FileUtils;
import com.github.jvm.agent.util.TypeRenderUtils;
import com.github.jvm.agent.util.affect.RowAffect;
import com.github.jvm.agent.util.command.SearchUtils;
import com.taobao.middleware.cli.annotations.*;
import com.taobao.text.Color;
import com.taobao.text.Decoration;
import com.taobao.text.lang.LangRenderUtil;
import com.taobao.text.ui.Element;
import com.taobao.text.ui.LabelElement;
import com.taobao.text.ui.TableElement;
import com.taobao.text.util.RenderUtil;
import io.termd.core.function.Consumer;
import io.termd.core.tty.TtyConnection;
import lombok.extern.slf4j.Slf4j;
import org.benf.cfr.reader.Main;
import org.objectweb.asm.Type;

import java.io.File;
import java.io.IOException;
import java.lang.instrument.Instrumentation;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import static com.taobao.text.ui.Element.label;

@Name("jad")
@Summary("Decompile class")
@Description(Constants.EXAMPLE +
        "  jad -c 39eb305e org.apache.log4j.Logger\n" +
        "  jad -c 39eb305e org/apache/log4j/Logger\n" +
        "  jad -c 39eb305e -E org\\\\.apache\\\\.*\\\\.StringUtils\n")
@Slf4j
public class JadCommand extends GeneralCommand {
    private static Pattern pattern = Pattern.compile("(?m)^/\\*\\s*\\*/\\s*$" + System.getProperty("line.separator"));
    private static final String OUTPUTOPTION = "--outputdir";
    private static final String COMMENTS = "--comments";
    private static final String DecompilePath = new File(".").getParent() + File.separator + "decompile";

    private String classPattern;
    private String methodName;
    private String code = null;
    private boolean isRegEx = false;

    @Argument(argName = "class-pattern", index = 0)
    @Description("Class name pattern, use either '.' or '/' as separator")
    public void setClassPattern(String classPattern) {
        this.classPattern = classPattern;
    }

    @Argument(argName = "method-name", index = 1, required = false)
    @Description("method name pattern, decompile a specific method instead of the whole class")
    public void setMethodPattern(String methodName) {
        this.methodName = methodName;
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

    public JadCommand(TtyConnection conn, Instrumentation inst) {
        super(conn, inst);
    }

    @Override
    public void process(Consumer<int[]> out) {
        RowAffect affect = new RowAffect();

        Set<Class<?>> matchedClasses = SearchUtils.searchClassOnly(inst, classPattern, isRegEx, code);
        try {
            if (matchedClasses == null || matchedClasses.isEmpty()) {
                processNoMatch(conn);
            } else if (matchedClasses.size() > 1) {
                processMatches(conn, matchedClasses);
            } else {
                Set<Class<?>> withInnerClasses = SearchUtils.searchClassOnly(inst, classPattern + "(?!.*\\$\\$Lambda\\$).*", true, code);
                processExactMatch(conn, affect, inst, matchedClasses, withInnerClasses);
            }
        } finally {
            conn.write(affect + "\n");
        }
    }

    /**
     * 反编译具体类
     *
     * @param conn
     * @param affect
     * @param inst
     * @param matchedClasses
     * @param withInnerClasses
     */
    private void processExactMatch(TtyConnection conn, RowAffect affect, Instrumentation inst, Set<Class<?>> matchedClasses,
                                   Set<Class<?>> withInnerClasses) {
        Class<?> c = matchedClasses.iterator().next();
        matchedClasses = withInnerClasses;

        try {
            ClassDumpTransformer transformer = new ClassDumpTransformer(matchedClasses);
            Enhancer.enhance(inst, transformer, matchedClasses);
            Map<Class<?>, File> classFiles = transformer.getDumpResult();
            File classFile = classFiles.get(c);

            String source;
            source = decompileWithCFR(classFile.getAbsolutePath(), c, methodName);
            if (source != null) {
                source = pattern.matcher(source).replaceAll("");
            } else {
                source = "unknown";
            }

            conn.write("\n");
            conn.write(RenderUtil.render(new LabelElement("ClassLoader: ").style(Decoration.bold.fg(Color.red)), 120));
            conn.write(RenderUtil.render(TypeRenderUtils.drawClassLoader(c), 120) + "\n");
            conn.write(RenderUtil.render(new LabelElement("Location: ").style(Decoration.bold.fg(Color.red)), 120));
            conn.write(RenderUtil.render(new LabelElement(SearchClassCommand.getCodeSource(
                    c.getProtectionDomain().getCodeSource())).style(Decoration.bold.fg(Color.blue)), 120) + "\n");
            conn.write(LangRenderUtil.render(source) + "\n");
            conn.write(Constants.EMPTY_STRING);
            affect.rCnt(classFiles.keySet().size());
        } catch (Exception e) {
            log.error("jad: fail to decompile class: " + c.getName());
        }
    }

    private String decompileWithCFR(String classPath, Class<?> clazz, String methodName) {
        List<String> options = new ArrayList<String>();
        options.add(classPath);
//        options.add(clazz.getName());
        if (methodName != null) {
            options.add(methodName);
        }
        options.add(OUTPUTOPTION);
        options.add(DecompilePath);
        options.add(COMMENTS);
        options.add("false");
        String args[] = new String[options.size()];
        options.toArray(args);
        Main.main(args);
        String outputFilePath = DecompilePath + File.separator + Type.getInternalName(clazz) + ".java";
        File outputFile = new File(outputFilePath);
        if (outputFile.exists()) {
            try {
                return FileUtils.readFileToString(outputFile, Charset.defaultCharset());
            } catch (IOException e) {
                log.error("error read decompile result in: " + outputFilePath, e);
            }
        }

        return null;
    }

    /**
     * 多个匹配
     *
     * @param conn
     * @param matchedClasses
     */
    private void processMatches(TtyConnection conn, Set<Class<?>> matchedClasses) {
        Element usage = new LabelElement("jad -c <hashcode> " + classPattern).style(Decoration.bold.fg(Color.blue));
        conn.write("\n Found more than one class for: " + classPattern + ", Please use "
                + RenderUtil.render(usage, 120));

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

    /**
     * 没有匹配
     *
     * @param conn
     */
    private void processNoMatch(TtyConnection conn) {
        conn.write("No class found for: " + classPattern + "\n");
    }
}
