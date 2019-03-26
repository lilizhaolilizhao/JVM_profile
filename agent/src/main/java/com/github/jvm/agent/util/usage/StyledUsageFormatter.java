package com.github.jvm.agent.util.usage;

import com.github.jvm.agent.command.Command;
import com.taobao.middleware.cli.UsageMessageFormatter;
import com.taobao.middleware.cli.annotations.*;
import com.taobao.text.Color;
import com.taobao.text.Decoration;
import com.taobao.text.Style;
import com.taobao.text.ui.RowElement;
import com.taobao.text.ui.TableElement;
import com.taobao.text.util.RenderUtil;

import java.lang.reflect.Method;
import java.util.*;

import static com.taobao.text.ui.Element.label;
import static com.taobao.text.ui.Element.row;

/**
 * 格式化显示显示样式
 */
public class StyledUsageFormatter extends UsageMessageFormatter {
    private Color fontColor;

    public StyledUsageFormatter(Color fontColor) {
        this.fontColor = fontColor;
    }


    public void usageMsg(StringBuilder builder, Class<? extends Command> clazz) {
        TableElement table = new TableElement(1, 2).leftCellPadding(1).rightCellPadding(1);

        table.add(row().add(label("USAGE:").style(getHighlightedStyle())));
        table.add(row().add(label(computeUsageLine(clazz))));
        table.add(row().add(""));
        table.add(row().add(label("SUMMARY:").style(getHighlightedStyle())));

        Summary summary = clazz.getAnnotation(Summary.class);
        table.add(row().add(label("  " + summary.value())));

        Description description = clazz.getAnnotation(Description.class);
        if (description != null) {
            String[] descLines = description.value().split("\\n");
            for (String line : descLines) {
                if (shouldBeHighlighted(line)) {
                    table.add(row().add(label(line).style(getHighlightedStyle())));
                } else {
                    table.add(row().add(label(line)));
                }
            }
        }

        Method[] methods = clazz.getMethods();
        List<RowElement> rowElements = new ArrayList<RowElement>();
        for (Method method : methods) {
            Option option = method.getAnnotation(Option.class);
            Description fieldDesc = method.getAnnotation(Description.class);
            Argument argument = method.getAnnotation(Argument.class);

            if (option != null || argument != null) {
                if (option != null) {
                    if (option.acceptValue()) {
                        rowElements.add(row().add(label("-" + option.shortName() + ", --" + option.longName() + " <value>")
                                .style(getHighlightedStyle()))
                                .add(fieldDesc.value()));
                    } else {
                        rowElements.add(row().add(label("-" + option.shortName() + ", --" + option.longName())
                                .style(getHighlightedStyle()))
                                .add(fieldDesc.value()));
                    }
                }

                if (argument != null) {
                    rowElements.add(row().add(label("<" + argument.argName() + ">").style(getHighlightedStyle()))
                            .add(fieldDesc.value()));
                }
            }
        }

        if (rowElements.size() > 0) {
            table.add(row().add(""));
            table.row(label("OPTIONS:").style(getHighlightedStyle()));
            table.add(rowElements.toArray(new RowElement[rowElements.size()]));
        }

        builder.append(RenderUtil.render(table, getWidth()));
    }

    private Style.Composite getHighlightedStyle() {
        return Style.style(Decoration.bold, fontColor);
    }

    private String computeUsageLine(Class<? extends Command> clazz) {
        // initialise the string buffer
        StringBuilder buff = new StringBuilder("  ");

        final Name name = clazz.getAnnotation(Name.class);
        buff.append(name.value()).append(" ");

        //对方法进行排序
        Method[] methods = clazz.getMethods();
        List<Method> methodList = Arrays.asList(methods);
        Collections.sort(methodList, new Comparator<Method>() {
            @Override
            public int compare(Method o1, Method o2) {
                Option option1 = o1.getAnnotation(Option.class);
                Option option2 = o2.getAnnotation(Option.class);

                if (option1 != null && option2 != null) {
                    String longName1 = option1.longName();
                    String shortName1 = option1.shortName();

                    String longName2 = option2.longName();
                    String shortName2 = option2.shortName();

                    String name1 = longName1 == null ? longName1 : shortName1;
                    String name2 = longName2 == null ? longName2 : shortName2;

                    if (name1 != null && name2 == null) {
                        return name1.compareToIgnoreCase(name2);
                    }
                } else if (option1 == null && option2 != null) {
                    return -1;
                } else if (option1 != null && option2 == null) {
                    return 1;
                }

                return 1;
            }
        });

        // iterate over the options
        for (Method method : methodList) {
            Option option = method.getAnnotation(Option.class);
            Argument argument = method.getAnnotation(Argument.class);

            if (option != null) {
                appendOption(buff, new com.taobao.middleware.cli.Option().setShortName(option.shortName())
                        .setLongName(option.longName()).setFlag(option.flag()));
                buff.append(" ");
            }

            if (argument != null) {
                appendArgument(buff, new com.taobao.middleware.cli.Argument().setArgName(argument.argName()), argument.required());
                buff.append(" ");
            }
        }

        return buff.toString();
    }

    private boolean shouldBeHighlighted(String line) {
        return !line.startsWith(" ");
    }

}
