package com.github.jvm.agent.util;

import com.taobao.text.Color;
import com.taobao.text.Decoration;
import com.taobao.text.ui.TableElement;
import com.taobao.text.util.RenderUtil;
import lombok.extern.slf4j.Slf4j;

import java.io.InputStream;

import static com.taobao.text.ui.Element.label;

@Slf4j
public class JVMBanner {

    private static final String LOGO_LOCATION = "/com/github/jvm/agent/res/logo.txt";
    private static final String VERSION_LOCATION = "/com/github/jvm/agent/res/version";

    private static String LOGO = "Welcome to JVM Agent";
    private static String VERSION = "unknown";

    static {
        try {
            String logoText = IOUtils.toString(JVMBanner.class.getResourceAsStream(LOGO_LOCATION));
            InputStream versionInputStream = JVMBanner.class.getResourceAsStream(VERSION_LOCATION);
            if (versionInputStream != null) {
                VERSION = IOUtils.toString(versionInputStream).trim();
            } else {
                String implementationVersion = JVMBanner.class.getPackage().getImplementationVersion();
                if (implementationVersion != null) {
                    VERSION = implementationVersion;
                }
            }

            StringBuilder sb = new StringBuilder();
            String[] LOGOS = new String[10];
            int i = 0, j = 0;
            for (String line : logoText.split("\n")) {
                sb.append(line);
                sb.append("\n");
                if (i++ == 5) {
                    LOGOS[j++] = sb.toString();
                    i = 0;
                    sb.setLength(0);
                }
            }

            TableElement logoTable = new TableElement();
            logoTable.row(label(LOGOS[0]).style(Decoration.bold.fg(Color.red)),
                    label(LOGOS[1]).style(Decoration.bold.fg(Color.yellow)),
                    label(LOGOS[2]).style(Decoration.bold.fg(Color.cyan)),
                    label(LOGOS[3]).style(Decoration.bold.fg(Color.magenta)),
                    label(LOGOS[4]).style(Decoration.bold.fg(Color.green)),
                    label(LOGOS[5]).style(Decoration.bold.fg(Color.red)),
                    label(LOGOS[6]).style(Decoration.bold.fg(Color.magenta)),
                    label(LOGOS[7]).style(Decoration.bold.fg(Color.yellow)),
                    label(LOGOS[8]).style(Decoration.bold.fg(Color.cyan)));
            LOGO = RenderUtil.render(logoTable);
        } catch (Throwable e) {
            log.info("logo信息加载错误: ", e);
        }
    }

    public static String logo() {
        return LOGO;
    }

    public static String welcome() {
        return logo() + "\nWelcome to use JVM tools.";
    }
}
