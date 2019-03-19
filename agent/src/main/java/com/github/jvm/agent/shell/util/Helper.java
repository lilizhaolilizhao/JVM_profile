package com.github.jvm.agent.shell.util;

import com.github.jvm.agent.shell.ShellServerOptions;
import io.termd.core.readline.Keymap;
import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 工具类
 */
@Slf4j
public class Helper {

    public static Keymap loadKeymap() {
        return new Keymap(loadInputRcFile());
    }

    public static InputStream loadInputRcFile() {
        InputStream inputrc = null;
        // step 1: load custom keymap file
        try {
            String customInputrc = System.getProperty("user.home") + "/conf/inputrc";
            inputrc = new FileInputStream(customInputrc);
            log.info("Loaded custom keymap file from " + customInputrc);
            return inputrc;
        } catch (Throwable e) {
            // ignore
        }

        // step 2: load arthas default keymap file
        if (inputrc == null) {
            try {
                inputrc = Helper.class.getClassLoader().getResourceAsStream(ShellServerOptions.DEFAULT_INPUTRC);
                if (inputrc != null) {
                    log.info("Loaded arthas keymap file from " + ShellServerOptions.DEFAULT_INPUTRC);
                    return inputrc;
                }
            } catch (Exception e) {
                // ignore
            }
        }

        // step 3: fall back to termd default keymap file
        if (inputrc == null) {
            try {
                inputrc = Keymap.class.getResourceAsStream("inputrc");
                if (inputrc != null) {
                    return inputrc;
                }
            } catch (Exception e) {
                // ignore
            }
        }

        throw new IllegalStateException("Could not load inputrc file.");
    }
}
