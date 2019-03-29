package com.github.jvm.agent.command.clazz;

import com.github.jvm.agent.command.GeneralCommand;
import com.github.jvm.agent.util.Constants;
import com.github.jvm.agent.util.affect.RowAffect;
import com.taobao.middleware.cli.annotations.Description;
import com.taobao.middleware.cli.annotations.Name;
import com.taobao.middleware.cli.annotations.Option;
import com.taobao.middleware.cli.annotations.Summary;
import com.taobao.text.Decoration;
import com.taobao.text.ui.*;
import com.taobao.text.util.RenderUtil;
import io.termd.core.function.Consumer;
import io.termd.core.tty.TtyConnection;

import java.lang.instrument.Instrumentation;
import java.net.URL;
import java.net.URLClassLoader;
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
        } else if (hashCode != null && resource != null) {
            processResources(conn, inst);
        } else if (hashCode != null) {
            processClassloader(conn, inst);
        } else if (listClassLoader || isTree) {
            processClassloaders(conn, inst);
        } else if (helpFlag) {
            writeHelpInfo(ClassLoaderCommand.class, 130);
        } else {
//            processClassLoaderStats(process, inst);
        }
    }

    private void processClassloaders(TtyConnection conn, Instrumentation inst) {
        RowAffect affect = new RowAffect();
        List<ClassLoaderInfo> classLoaderInfos = includeReflectionClassLoader ? getAllClassLoaderInfo(inst) :
                getAllClassLoaderInfo(inst, new SunReflectionClassLoaderFilter());
        Element element = isTree ? renderTree(classLoaderInfos) : renderTable(classLoaderInfos);
        conn.write(RenderUtil.render(element, 120)).write(Constants.EMPTY_STRING);
        affect.rCnt(classLoaderInfos.size());
        conn.write(affect + "\n");
    }

    // 统计所有的ClassLoader的信息
    private static TableElement renderTable(List<ClassLoaderInfo> classLoaderInfos) {
        TableElement table = new TableElement().leftCellPadding(1).rightCellPadding(1);
        table.add(new RowElement().style(Decoration.bold.bold()).add("name", "loadedCount", "hash", "parent"));
        for (ClassLoaderInfo info : classLoaderInfos) {
            table.row(info.getName(), "" + info.loadedClassCount(), info.hashCodeStr(), info.parentStr());
        }
        return table;
    }

    // 以树状列出ClassLoader的继承结构
    private static Element renderTree(List<ClassLoaderInfo> classLoaderInfos) {
        TreeElement root = new TreeElement();

        List<ClassLoaderInfo> parentNullClassLoaders = new ArrayList<ClassLoaderInfo>();
        List<ClassLoaderInfo> parentNotNullClassLoaders = new ArrayList<ClassLoaderInfo>();
        for (ClassLoaderInfo info : classLoaderInfos) {
            if (info.parent() == null) {
                parentNullClassLoaders.add(info);
            } else {
                parentNotNullClassLoaders.add(info);
            }
        }

        for (ClassLoaderInfo info : parentNullClassLoaders) {
            if (info.parent() == null) {
                TreeElement parent = new TreeElement(info.getName());
                renderParent(parent, info, parentNotNullClassLoaders);
                root.addChild(parent);
            }
        }

        return root;
    }

    private static void renderParent(TreeElement node, ClassLoaderInfo parent, List<ClassLoaderInfo> classLoaderInfos) {
        for (ClassLoaderInfo info : classLoaderInfos) {
            if (info.parent() == parent.classLoader) {
                TreeElement child = new TreeElement(info.getName());
                node.addChild(child);
                renderParent(child, info, classLoaderInfos);
            }
        }
    }

    private static List<ClassLoaderInfo> getAllClassLoaderInfo(Instrumentation inst, Filter... filters) {
        // 这里认为class.getClassLoader()返回是null的是由BootstrapClassLoader加载的，特殊处理
        ClassLoaderInfo bootstrapInfo = new ClassLoaderInfo(null);
        Map<ClassLoader, ClassLoaderInfo> loaderInfos = new HashMap<ClassLoader, ClassLoaderInfo>();

        for (Class<?> clazz : inst.getAllLoadedClasses()) {
            ClassLoader classLoader = clazz.getClassLoader();
            if (classLoader == null) {
                bootstrapInfo.increase();
            } else {
                if (shouldInclude(classLoader, filters)) {
                    ClassLoaderInfo loaderInfo = loaderInfos.get(classLoader);
                    if (loaderInfo == null) {
                        loaderInfo = new ClassLoaderInfo(classLoader);
                        loaderInfos.put(classLoader, loaderInfo);
                        ClassLoader parent = classLoader.getParent();
                        while (parent != null) {
                            ClassLoaderInfo parentLoaderInfo = loaderInfos.get(parent);
                            if (parentLoaderInfo == null) {
                                parentLoaderInfo = new ClassLoaderInfo(parent);
                                loaderInfos.put(parent, parentLoaderInfo);
                            }
                            parent = parent.getParent();
                        }
                    }
                    loaderInfo.increase();
                }
            }
        }

        // 排序时，把用户自己定的ClassLoader排在最前面，以sun.
        // 开头的放后面，因为sun.reflect.DelegatingClassLoader的实例太多
        List<ClassLoaderInfo> sunClassLoaderList = new ArrayList<ClassLoaderInfo>();
        List<ClassLoaderInfo> otherClassLoaderList = new ArrayList<ClassLoaderInfo>();
        for (Map.Entry<ClassLoader, ClassLoaderInfo> entry : loaderInfos.entrySet()) {
            ClassLoader classLoader = entry.getKey();
            if (classLoader.getClass().getName().startsWith("sun.")) {
                sunClassLoaderList.add(entry.getValue());
            } else {
                otherClassLoaderList.add(entry.getValue());
            }
        }

        Collections.sort(sunClassLoaderList);
        Collections.sort(otherClassLoaderList);

        List<ClassLoaderInfo> result = new ArrayList<ClassLoaderInfo>();
        result.add(bootstrapInfo);
        result.addAll(otherClassLoaderList);
        result.addAll(sunClassLoaderList);
        return result;
    }

    private void processResources(TtyConnection conn, Instrumentation inst) {
        RowAffect affect = new RowAffect();

        int rowCount = 0;
        Set<ClassLoader> allClassLoader = includeReflectionClassLoader ? getAllClassLoader(inst) :
                getAllClassLoader(inst, new SunReflectionClassLoaderFilter());
        for (ClassLoader cl : allClassLoader) {
            if (Integer.toString(cl.hashCode()).equals(hashCode)) {
                TableElement table = new TableElement().leftCellPadding(1).rightCellPadding(1);
                try {
                    Enumeration<URL> urls = cl.getResources(resource);
                    while (urls.hasMoreElements()) {
                        URL url = urls.nextElement();
                        table.row(url.toString());
                        rowCount++;
                    }
                } catch (Throwable e) {
                    e.printStackTrace();
                }
                conn.write(RenderUtil.render(table, 120) + "\n");
            }
        }

        conn.write(Constants.EMPTY_STRING);
        conn.write(affect.rCnt(rowCount) + "\n");
    }

    /**
     * 根据 hashCode 来打印URLClassLoader的urls
     *
     * @param conn
     * @param inst
     */
    private void processClassloader(TtyConnection conn, Instrumentation inst) {
        RowAffect affect = new RowAffect();

        Set<ClassLoader> allClassLoader = getAllClassLoader(inst);
        for (ClassLoader cl : allClassLoader) {
            if (Integer.toString(cl.hashCode()).equals(hashCode)) {
                conn.write(RenderUtil.render(renderClassLoaderUrls(cl), 120));
            }
        }
        affect.rCnt(allClassLoader.size());

        conn.write(Constants.EMPTY_STRING);
        conn.write(affect + "\n");
    }

    private Element renderClassLoaderUrls(ClassLoader classLoader) {
        StringBuilder sb = new StringBuilder();
        if (classLoader instanceof URLClassLoader) {
            URLClassLoader cl = (URLClassLoader) classLoader;
            URL[] urls = cl.getURLs();
            if (urls != null) {
                for (URL url : urls) {
                    sb.append(url.toString() + "\n");
                }
                return new LabelElement(sb.toString());
            } else {
                return new LabelElement("urls is empty.");
            }
        } else {
            return new LabelElement("not a URLClassLoader.\n");
        }
    }

    private static Set<ClassLoader> getAllClassLoader(Instrumentation inst, Filter... filters) {
        Set<ClassLoader> classLoaderSet = new HashSet<ClassLoader>();

        for (Class<?> clazz : inst.getAllLoadedClasses()) {
            ClassLoader classLoader = clazz.getClassLoader();
            if (classLoader != null) {
                if (shouldInclude(classLoader, filters)) {
                    classLoaderSet.add(classLoader);
                }
            }
        }
        return classLoaderSet;
    }

    private static boolean shouldInclude(ClassLoader classLoader, Filter... filters) {
        if (filters == null) {
            return true;
        }

        for (Filter filter : filters) {
            if (!filter.accept(classLoader)) {
                return false;
            }
        }
        return true;
    }

    private interface Filter {
        boolean accept(ClassLoader classLoader);
    }

    private static class SunReflectionClassLoaderFilter implements Filter {
        private static final String REFLECTION_CLASSLOADER = "sun.reflect.DelegatingClassLoader";

        @Override
        public boolean accept(ClassLoader classLoader) {
            return !REFLECTION_CLASSLOADER.equals(classLoader.getClass().getName());
        }
    }

    private static class ClassLoaderInfo implements Comparable<ClassLoaderInfo> {
        private ClassLoader classLoader;
        private int loadedClassCount = 0;

        ClassLoaderInfo(ClassLoader classLoader) {
            this.classLoader = classLoader;
        }

        public ClassLoader getClassLoader() {
            return classLoader;
        }

        public String getName() {
            if (classLoader != null) {
                return classLoader.toString();
            }
            return "BootstrapClassLoader";
        }

        String hashCodeStr() {
            if (classLoader != null) {
                return "" + Integer.toHexString(classLoader.hashCode());
            }
            return "null";
        }

        void increase() {
            loadedClassCount++;
        }

        int loadedClassCount() {
            return loadedClassCount;
        }

        ClassLoader parent() {
            return classLoader == null ? null : classLoader.getParent();
        }

        String parentStr() {
            if (classLoader == null) {
                return "null";
            }
            ClassLoader parent = classLoader.getParent();
            if (parent == null) {
                return "null";
            }
            return parent.toString();
        }

        @Override
        public int compareTo(ClassLoaderInfo other) {
            if (other == null) {
                return -1;
            }
            if (other.classLoader == null) {
                return -1;
            }
            if (this.classLoader == null) {
                return -1;
            }

            return this.classLoader.getClass().getName().compareTo(other.classLoader.getClass().getName());
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
