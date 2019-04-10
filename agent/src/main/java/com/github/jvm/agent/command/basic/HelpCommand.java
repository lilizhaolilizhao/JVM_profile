package com.github.jvm.agent.command.basic;

import com.github.jvm.agent.command.BuiltinCommandPack;
import com.github.jvm.agent.command.Command;
import com.github.jvm.agent.command.GeneralCommand;
import com.taobao.middleware.cli.annotations.Description;
import com.taobao.middleware.cli.annotations.Name;
import com.taobao.middleware.cli.annotations.Summary;
import com.taobao.text.Color;
import com.taobao.text.Decoration;
import com.taobao.text.Style;
import com.taobao.text.ui.Element;
import com.taobao.text.ui.LabelElement;
import com.taobao.text.ui.TableElement;
import com.taobao.text.util.RenderUtil;
import io.termd.core.function.Consumer;
import io.termd.core.tty.TtyConnection;

import java.util.List;

import static com.taobao.text.ui.Element.label;
import static com.taobao.text.ui.Element.row;

/**
 * 帮助命令
 */
@Name("help")
@Summary("Display Arthas Help")
@Description("Examples:\n" + " help\n" + " help sc\n" + " help sm\n" + " help watch")
public class HelpCommand extends GeneralCommand {
    public HelpCommand(TtyConnection conn) {
        super(conn);
    }

    @Override
    public void process(Consumer<int[]> out) {
        List<Class<? extends Command>> commands = BuiltinCommandPack.getCommands();

        String message = RenderUtil.render(mainHelp(commands), 120);
        conn.write(message);
    }

    /**
     * 获得所有命令注释信息
     *
     * @param commands
     * @return
     */
    private static Element mainHelp(List<Class<? extends Command>> commands) {
        TableElement table = new TableElement().leftCellPadding(1).rightCellPadding(1);
        table.row(new LabelElement("NAME").style(Style.style(Decoration.bold)), new LabelElement("DESCRIPTION"));
        for (Class<? extends Command> command : commands) {
            Name nameAnnotation = command.getAnnotation(Name.class);
            Summary summaryAnnotation = command.getAnnotation(Summary.class);

            table.add(row().add(label(nameAnnotation.value()).style(Style.style(Color.green))).add(label(summaryAnnotation.value())));
        }
        return table;
    }
}
