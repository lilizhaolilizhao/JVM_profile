package com.github.jvm.agent.command.clazz;

import com.github.jvm.agent.command.GeneralCommand;
import com.github.jvm.agent.util.Constants;
import com.taobao.middleware.cli.annotations.Description;
import com.taobao.middleware.cli.annotations.Name;
import com.taobao.middleware.cli.annotations.Option;
import com.taobao.middleware.cli.annotations.Summary;
import io.termd.core.function.Consumer;
import io.termd.core.tty.TtyConnection;
import org.objectweb.asm.ClassReader;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.instrument.ClassDefinition;
import java.lang.instrument.Instrumentation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Redefine Classes.
 *
 * @see java.lang.instrument.Instrumentation#redefineClasses(ClassDefinition...)
 */
@Name("redefine")
@Summary("Redefine classes. @see Instrumentation#redefineClasses(ClassDefinition...)")
@Description(Constants.EXAMPLE +
        "  redefine -p /tmp/Test.class\n" +
        "  redefine -c 327a647b -p /tmp/Test.class /tmp/Test\\$Inner.class \n")
public class RedefineCommand extends GeneralCommand {
    private static final int MAX_FILE_SIZE = 10 * 1024 * 1024;

    private String hashCode;
    private List<String> paths;

    @Option(shortName = "c", longName = "classloader")
    @Description("classLoader hashcode")
    public void setHashCode(String hashCode) {
        this.hashCode = hashCode;
    }

    @Option(shortName = "p", longName = "path", acceptMultipleValues = true)
    @Description(".class file paths")
    public void setPathPatterns(List<String> paths) {
        this.paths = paths;
    }

    public RedefineCommand(TtyConnection conn, Instrumentation inst) {
        super(conn, inst);
    }

    @Override
    public void process(Consumer<int[]> out) {
        if (helpFlag) {
            writeHelpInfo(RedefineCommand.class);
        } else if (paths == null || paths.isEmpty()) {
            conn.write("paths is empty.\n");
        } else {
            for (String path : paths) {
                File file = new File(path);
                if (!file.exists()) {
                    conn.write("path is not exists, path:" + path + "\n");
                    return;
                }
                if (!file.isFile()) {
                    conn.write("path is not a normal file, path:" + path + "\n");
                    return;
                }
                if (file.length() >= MAX_FILE_SIZE) {
                    conn.write("file size: " + file.length() + " >= " + MAX_FILE_SIZE + ", path: " + path + "\n");
                    return;
                }
            }

            Map<String, byte[]> bytesMap = new HashMap<String, byte[]>();
            for (String path : paths) {
                RandomAccessFile f = null;
                try {
                    f = new RandomAccessFile(path, "r");
                    final byte[] bytes = new byte[(int) f.length()];
                    f.readFully(bytes);

                    final String clazzName = readClassName(bytes);

                    bytesMap.put(clazzName, bytes);

                } catch (Exception e) {
                    conn.write("" + e + "\n");
                } finally {
                    if (f != null) {
                        try {
                            f.close();
                        } catch (IOException e) {
                            // ignore
                        }
                    }
                }
            }

            if (bytesMap.size() != paths.size()) {
                conn.write("paths may contains same class name!\n");
                return;
            }

            List<ClassDefinition> definitions = new ArrayList<ClassDefinition>();
            for (Class<?> clazz : inst.getAllLoadedClasses()) {
                if (bytesMap.containsKey(clazz.getName())) {
                    if (hashCode != null && !Integer.toHexString(clazz.getClassLoader().hashCode()).equals(hashCode)) {
                        continue;
                    }
                    definitions.add(new ClassDefinition(clazz, bytesMap.get(clazz.getName())));
                }
            }

            try {
                inst.redefineClasses(definitions.toArray(new ClassDefinition[0]));
                conn.write("redefine success, size: " + definitions.size() + "\n");
            } catch (Exception e) {
                conn.write("redefine error! " + e + "\n");
            }
        }
    }

    private String readClassName(byte[] bytes) {
        return new ClassReader(bytes).getClassName().replace("/", ".");
    }
}
