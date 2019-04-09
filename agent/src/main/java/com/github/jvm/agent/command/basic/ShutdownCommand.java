package com.github.jvm.agent.command.basic;

import com.github.jvm.agent.advisor.Enhancer;
import com.github.jvm.agent.command.GeneralCommand;
import com.github.jvm.agent.shell.term.TermServer;
import com.github.jvm.agent.util.affect.EnhancerAffect;
import com.github.jvm.agent.util.matcher.WildcardMatcher;
import com.taobao.middleware.cli.annotations.Name;
import com.taobao.middleware.cli.annotations.Summary;
import io.termd.core.function.Consumer;
import io.termd.core.tty.TtyConnection;
import lombok.extern.slf4j.Slf4j;

import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;

/**
 * 关闭命令
 */
@Name("shut")
@Summary("Shut down jvm server and exit the console")
@Slf4j
public class ShutdownCommand extends GeneralCommand {

    public ShutdownCommand(TtyConnection conn, Instrumentation inst, TermServer term) {
        super(conn, inst, term);
    }

    @Override
    public void process(Consumer<int[]> out) {
        if (helpFlag) {
            writeHelpInfo(ShutdownCommand.class);
        } else {
            try {
                EnhancerAffect enhancerAffect = Enhancer.reset(inst, new WildcardMatcher("*"));
                conn.write(enhancerAffect.toString()).write("\n");
                conn.write("Jvm Server is going to shut down...\n");
            } catch (UnmodifiableClassException e) {
                log.info("reset class异常.", e);
            } finally {
                conn.close();
                term.close();
            }
        }
    }
}
