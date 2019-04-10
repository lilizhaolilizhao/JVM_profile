package com.github.jvm.agent.command.basic;

import com.github.jvm.agent.command.GeneralCommand;
import com.github.jvm.agent.util.Constants;
import com.github.jvm.agent.util.StringUtils;
import com.taobao.middleware.cli.annotations.Argument;
import com.taobao.middleware.cli.annotations.Description;
import com.taobao.middleware.cli.annotations.Name;
import com.taobao.middleware.cli.annotations.Summary;
import com.taobao.text.Decoration;
import com.taobao.text.ui.TableElement;
import com.taobao.text.util.RenderUtil;
import io.termd.core.function.Consumer;
import io.termd.core.tty.TtyConnection;

import java.util.Properties;

import static com.taobao.text.ui.Element.label;

/**
 * A command to display all the keymap for the specified connection.
 */
@Name("sysprop")
@Summary("Display, and change the system properties.")
@Description(Constants.EXAMPLE + "sysprop\n" + "sysprop file.encoding\n" + "sysprop production.mode true\n" + "sysprop")
public class SystemPropertyCommand extends GeneralCommand {
    private String propertyName;
    private String propertyValue;

    @Argument(index = 0, argName = "property-name", required = false)
    @Description("property name")
    public void setOptionName(String propertyName) {
        this.propertyName = propertyName;
    }

    @Argument(index = 1, argName = "property-value", required = false)
    @Description("property value")
    public void setOptionValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    public SystemPropertyCommand(TtyConnection conn) {
        super(conn);
    }

    @Override
    public void process(Consumer<int[]> out) {
        if (helpFlag) {
            writeHelpInfo(SystemPropertyCommand.class);
        } else {
            try {
                if (StringUtils.isBlank(propertyName) && StringUtils.isBlank(propertyValue)) {
                    // show all system properties
                    conn.write(renderSystemProperties(System.getProperties(), 120));
                } else if (StringUtils.isBlank(propertyValue)) {
                    // view the specified system property
                    String value = System.getProperty(propertyName);
                    if (value == null) {
                        conn.write("In order to change the system properties, you must specify the property value.\n");
                    } else {
                        conn.write(propertyName + "=" + value + "\n");
                    }
                } else {
                    // change system property
                    System.setProperty(propertyName, propertyValue);
                    conn.write("Successfully changed the system property.\n");
                    conn.write(propertyName + "=" + System.getProperty(propertyName) + "\n");
                }
            } catch (Exception e) {
                conn.write("Error during setting system property: " + e.getMessage() + "\n");
            }
        }
    }

    private String renderSystemProperties(Properties properties, int width) {
        TableElement table = new TableElement(1, 4).leftCellPadding(1).rightCellPadding(1);
        table.row(true, label("KEY").style(Decoration.bold.bold()),
                label("VALUE").style(Decoration.bold.bold()));

        for (String name : properties.stringPropertyNames()) {
            table.row(name, properties.getProperty(name));
        }

        return RenderUtil.render(table, width);
    }
}
