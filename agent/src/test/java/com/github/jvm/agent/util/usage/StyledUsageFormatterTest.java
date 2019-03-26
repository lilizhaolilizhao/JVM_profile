package com.github.jvm.agent.util.usage;

import com.github.jvm.agent.command.clazz.SearchClassCommand;
import org.junit.Test;

public class StyledUsageFormatterTest {

    @Test
    public void computeUsageLineTest() {
        StyledUsageFormatter formatter = new StyledUsageFormatter(null);

        StringBuilder builder = new StringBuilder();
        formatter.usageMsg(builder, SearchClassCommand.class);

        System.out.println(builder);
    }
}
