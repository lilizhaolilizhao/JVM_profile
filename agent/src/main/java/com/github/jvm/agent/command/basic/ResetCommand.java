package com.github.jvm.agent.command.basic;

import com.github.jvm.agent.advisor.Enhancer;
import com.github.jvm.agent.command.GeneralCommand;
import com.github.jvm.agent.util.Constants;
import com.github.jvm.agent.util.affect.EnhancerAffect;
import com.github.jvm.agent.util.command.SearchUtils;
import com.github.jvm.agent.util.matcher.Matcher;
import com.taobao.middleware.cli.annotations.*;
import io.termd.core.function.Consumer;
import io.termd.core.tty.TtyConnection;
import lombok.extern.slf4j.Slf4j;

import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;

/**
 * 恢复所有增强类
 */
@Name("reset")
@Summary("Reset all the enhanced classes")
@Description(Constants.EXAMPLE +
        "  reset\n" +
        "  reset *List\n" +
        "  reset -E .*List\n")
@Slf4j
public class ResetCommand extends GeneralCommand {
    private String classPattern;
    private boolean isRegEx = false;

    @Argument(index = 0, argName = "class-pattern", required = false)
    @Description("Path and classname of Pattern Matching")
    public void setClassPattern(String classPattern) {
        this.classPattern = classPattern;
    }

    @Option(shortName = "E", longName = "regex", flag = true)
    @Description("Enable regular expression to match (wildcard matching by default)")
    public void setRegEx(boolean regEx) {
        isRegEx = regEx;
    }

    public ResetCommand(TtyConnection conn, Instrumentation inst) {
        super(conn, inst);
    }

    @Override
    public void process(Consumer<int[]> out) {
        if (helpFlag) {
            writeHelpInfo(ResetCommand.class);
        } else {
            Matcher matcher = SearchUtils.classNameMatcher(classPattern, isRegEx);
            EnhancerAffect enhancerAffect;
            try {
                enhancerAffect = Enhancer.reset(inst, matcher);
                conn.write(enhancerAffect.toString()).write("\n");
            } catch (UnmodifiableClassException e) {
                log.info("reset异常: ", e);
            }
        }
    }
}
