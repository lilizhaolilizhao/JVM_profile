package com.github.jvm.agent.command.basic;

import com.github.jvm.agent.command.GeneralCommand;
import com.github.jvm.agent.shell.util.Helper;
import com.taobao.middleware.cli.annotations.Name;
import com.taobao.middleware.cli.annotations.Summary;
import io.termd.core.function.Consumer;
import io.termd.core.tty.TtyConnection;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

@Name("keymap")
@Summary("Display all the available keymap for the specified connection.")
public class KeymapCommand extends GeneralCommand {

    public KeymapCommand(TtyConnection conn) {
        super(conn);
    }

    @Override
    public void process(Consumer<int[]> out) {
        InputStream inputrc = Helper.loadInputRcFile();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputrc));
        StringBuilder sb = new StringBuilder();
        String line;
        try {
            while ((line = br.readLine()) != null) {
                if (line.startsWith("#") || "".equals(line.trim())) {
                    continue;
                }
                sb.append(line + "\n");
            }
        } catch (Exception e) {
            sb.append(e.getMessage());
        }

        conn.write(sb.toString());
    }
}
