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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

        //对方法进行排序
        final Name name = clazz.getAnnotation(Name.class);
        List<Method> methodList = getUsageMethods(clazz);

        table.add(row().add(label(computeUsageLine(name.value(), methodList))));
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

        List<RowElement> rowElements = new ArrayList<RowElement>();
        for (Method method : methodList) {
            Option option = method.getAnnotation(Option.class);
            Description fieldDesc = method.getAnnotation(Description.class);
            Argument argument = method.getAnnotation(Argument.class);

            if (option != null || argument != null) {
                if (option != null) {
                    if (!option.flag()) {
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

    /**
     * 获取配置的方法信息并根据 longname 排序
     *
     * @param clazz
     * @return
     */
    private List<Method> getUsageMethods(Class<? extends Command> clazz) {
        Method[] methods = clazz.getMethods();
        List<Method> methodList = new ArrayList<Method>();

        for (Method method : methods) {
            Option option = method.getAnnotation(Option.class);
            Argument argument = method.getAnnotation(Argument.class);

            if (option != null || argument != null) {
                methodList.add(method);
            }
        }

        Collections.sort(methodList, new Comparator<Method>() {
            @Override
            public int compare(Method o1, Method o2) {
                Option option1 = o1.getAnnotation(Option.class);
                Option option2 = o2.getAnnotation(Option.class);
                Argument argument1 = o1.getAnnotation(Argument.class);
                Argument argument2 = o2.getAnnotation(Argument.class);

                if (option1 != null && option2 != null) {
                    String longName1 = option1.longName();
                    String longName2 = option2.longName();

                    return longName1.compareToIgnoreCase(longName2);
                } else if (option1 == null && option2 != null) {
                    return 1;
                } else if (option1 != null && option2 == null) {
                    return -1;
                }

                if (argument1 != null && argument2 != null) {
                    int index1 = argument1.index();
                    int index2 = argument2.index();

                    return index1 - index2;
                } else if (argument1 == null && argument2 != null) {
                    return 1;
                } else if (argument1 != null && argument2 == null) {
                    return -1;
                }

                return 1;
            }
        });
        return methodList;
    }

    private Style.Composite getHighlightedStyle() {
        return Style.style(Decoration.bold, fontColor);
    }

    /**
     * 拼接 USAGE 信息
     *
     * @param name
     * @param methodList
     * @return
     */
    private String computeUsageLine(String name, List<Method> methodList) {
        // initialise the string buffer
        StringBuilder buff = new StringBuilder("  ");
        buff.append(name).append(" ");

        // iterate over the options
        for (Method method : methodList) {
            Option option = method.getAnnotation(Option.class);
            Argument argument = method.getAnnotation(Argument.class);

            if (option != null) {
                appendOption(buff, new com.taobao.middleware.cli.Option().setShortName(option.shortName())
                        .setLongName(option.longName()).setSingleValued(!option.flag()));
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
