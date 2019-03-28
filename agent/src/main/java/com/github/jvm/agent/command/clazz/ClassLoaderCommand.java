package com.github.jvm.agent.command.clazz;

import com.github.jvm.agent.command.GeneralCommand;
import com.github.jvm.agent.util.Constants;
import com.github.jvm.agent.util.affect.RowAffect;
import com.taobao.middleware.cli.annotations.Description;
import com.taobao.middleware.cli.annotations.Name;
import com.taobao.middleware.cli.annotations.Option;
import com.taobao.middleware.cli.annotations.Summary;
import com.taobao.text.Decoration;
import com.taobao.text.ui.Element;
import com.taobao.text.ui.LabelElement;
import com.taobao.text.ui.TableElement;
import com.taobao.text.util.RenderUtil;
import io.termd.core.function.Consumer;
import io.termd.core.tty.TtyConnection;

import java.lang.instrument.Instrumentation;
import java.util.*;

@Name("classloader")
@Summary("Show classloader info")
@Description(Constants.EXAMPLE +
        "  classloader\n" +
        "  classloader -t\n" +
        "  classloader -c 327a647b\n" +
        "  classloader -c 327a647b -r META-INF/MANIFEST.MF\n" +
        "  classloader -a\n" +
        "  classloader -a -c 327a647b\n")
public class ClassLoaderCommand extends GeneralCommand {
    private boolean isTree = false;
    private String hashCode;
    private boolean all = false;
    private String resource;
    private boolean includeReflectionClassLoader = true;
    private boolean listClassLoader = false;

    @Option(shortName = "t", longName = "tree", flag = true)
    @Description("Display ClassLoader tree")
    public void setTree(boolean tree) {
        isTree = tree;
    }

    @Option(shortName = "c", longName = "classloader")
    @Description("Display ClassLoader urls")
    public void setHashCode(String hashCode) {
        this.hashCode = hashCode;
    }

    @Option(shortName = "a", longName = "all", flag = true)
    @Description("Display all classes loaded by ClassLoader")
    public void setAll(boolean all) {
        this.all = all;
    }

    @Option(shortName = "r", longName = "resource")
    @Description("Use ClassLoader to find resources, won't work without -c specified")
    public void setResource(String resource) {
        this.resource = resource;
    }

    @Option(shortName = "i", longName = "include-reflection-classloader", flag = true)
    @Description("Include sun.reflect.DelegatingClassLoader")
    public void setIncludeReflectionClassLoader(boolean includeReflectionClassLoader) {
        this.includeReflectionClassLoader = includeReflectionClassLoader;
    }

    @Option(shortName = "l", longName = "list-classloader", flag = true)
    @Description("Display statistics info by classloader instance")
    public void setListClassLoader(boolean listClassLoader) {
        this.listClassLoader = listClassLoader;
    }

    public ClassLoaderCommand(TtyConnection conn, Instrumentation inst) {
        super(conn, inst);
    }

    @Override
    public void process(Consumer<int[]> out) {
        if (all) {
            processAllClasses(conn, inst);
        } else if (helpFlag) {
            writeHelpInfo(ClassLoaderCommand.class, 130);
        } else {

        }
    }

    private void processAllClasses(TtyConnection conn, Instrumentation inst) {
        RowAffect affect = new RowAffect();
        conn.write(RenderUtil.render(renderClasses(hashCode, inst), 120));
        conn.write(affect + "\n");
    }

    /**
     * 获取到所有的class, 还有它们的classloader，按classloader归类好，统一输出每个classloader里有哪些class
     *
     * @param hashCode
     * @param inst
     * @return
     */
    private static Element renderClasses(String hashCode, Instrumentation inst) {
        int hashCodeInt = -1;
        if (hashCode != null) {
            hashCodeInt = Integer.valueOf(hashCode, 16);
        }

        SortedSet<Class> bootstrapClassSet = new TreeSet<Class>(new Comparator<Class>() {
            @Override
            public int compare(Class o1, Class o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        Class[] allLoadedClasses = inst.getAllLoadedClasses();
        Map<ClassLoader, SortedSet<Class>> classLoaderClassMap = new HashMap<ClassLoader, SortedSet<Class>>();
        for (Class clazz : allLoadedClasses) {
            ClassLoader classLoader = clazz.getClassLoader();
            // Class loaded by BootstrapClassLoader
            if (classLoader == null) {
                if (hashCode == null) {
                    bootstrapClassSet.add(clazz);
                }
                continue;
            }

            if (hashCode != null && classLoader.hashCode() != hashCodeInt) {
                continue;
            }

            SortedSet<Class> classSet = classLoaderClassMap.get(classLoader);
            if (classSet == null) {
                classSet = new TreeSet<Class>(new Comparator<Class>() {
                    @Override
                    public int compare(Class o1, Class o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                });
                classLoaderClassMap.put(classLoader, classSet);
            }
            classSet.add(clazz);
        }

        TableElement table = new TableElement().leftCellPadding(1).rightCellPadding(1);

        if (!bootstrapClassSet.isEmpty()) {
            table.row(new LabelElement("hash:null, BootstrapClassLoader").style(Decoration.bold.bold()));
            for (Class clazz : bootstrapClassSet) {
                table.row(new LabelElement(clazz.getName()));
            }
            table.row(new LabelElement(" "));
        }

        for (Map.Entry<ClassLoader, SortedSet<Class>> entry : classLoaderClassMap.entrySet()) {
            ClassLoader classLoader = entry.getKey();
            SortedSet<Class> classSet = entry.getValue();

            table.row(new LabelElement("hash:" + classLoader.hashCode() + ", " + classLoader.toString())
                    .style(Decoration.bold.bold()));
            for (Class clazz : classSet) {
                table.row(new LabelElement(clazz.getName()));
            }

            table.row(new LabelElement(" "));
        }
        return table;
    }
}
