package com.github.jvm.agent.util.usage;

import com.github.jvm.agent.command.klass.SearchClassCommand;
import org.junit.Test;

public class StyledUsageFormatterTest {

    @Test
    public void computeUsageLineTest() {
        StyledUsageFormatter formatter = new StyledUsageFormatter(null);
        formatter.usageMsg(new StringBuilder(), SearchClassCommand.class);
    }
}
