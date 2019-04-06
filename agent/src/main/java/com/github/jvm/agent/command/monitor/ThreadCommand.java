package com.github.jvm.agent.command.monitor;

import com.github.jvm.agent.command.GeneralCommand;
import com.github.jvm.agent.util.ArrayUtils;
import com.github.jvm.agent.util.Constants;
import com.github.jvm.agent.util.ThreadUtil;
import com.github.jvm.agent.util.affect.Affect;
import com.github.jvm.agent.util.affect.RowAffect;
import com.taobao.middleware.cli.annotations.*;
import com.taobao.text.renderers.ThreadRenderer;
import com.taobao.text.ui.LabelElement;
import com.taobao.text.util.RenderUtil;
import io.termd.core.function.Consumer;
import io.termd.core.tty.TtyConnection;

import java.lang.instrument.Instrumentation;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hengyunabc 2015年12月7日 下午2:06:21
 */
@Name("thread")
@Summary("Display thread info, thread stack")
@Description(Constants.EXAMPLE +
        "  thread\n" +
        "  thread 51\n" +
        "  thread -n -1\n" +
        "  thread -n 5\n" +
        "  thread -b\n" +
        "  thread -i 2000\n")
public class ThreadCommand extends GeneralCommand {
    private static ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();

    private long id = -1;
    private Integer topNBusy = null;
    private boolean findMostBlockingThread = false;
    private int sampleInterval = 100;

    public ThreadCommand(TtyConnection conn, Instrumentation inst) {
        super(conn, inst);
    }

    @Argument(index = 0, required = false, argName = "id")
    @Description("Show thread stack")
    public void setId(long id) {
        this.id = id;
    }

    @Option(shortName = "n", longName = "top-n-threads")
    @Description("The number of thread(s) to show, ordered by cpu utilization, -1 to show all.")
    public void setTopNBusy(Integer topNBusy) {
        this.topNBusy = topNBusy;
    }

    @Option(shortName = "b", longName = "include-blocking-thread", flag = true)
    @Description("Find the thread who is holding a lock that blocks the most number of threads.")
    public void setFindMostBlockingThread(boolean findMostBlockingThread) {
        this.findMostBlockingThread = findMostBlockingThread;
    }

    @Option(shortName = "i", longName = "sample-interval")
    @Description("Specify the sampling interval (in ms) when calculating cpu usage.")
    public void setSampleInterval(int sampleInterval) {
        this.sampleInterval = sampleInterval;
    }


    @Override
    public void process(Consumer<int[]> out) {
        Affect affect = new RowAffect();

        try {
            if (id > 0) {
                processThread(conn);
            } else if (topNBusy != null) {
                processTopBusyThreads(conn);
            } else if (findMostBlockingThread) {
                processBlockingThread(conn);
            } else if (helpFlag) {
                writeHelpInfo(ThreadCommand.class, 120);
            } else {
                processAllThreads(conn);
            }
        } finally {
            conn.write(affect + "\n");
        }
    }

    private void processBlockingThread(TtyConnection conn) {
        //TODO 未完成的部分
    }

    private void processTopBusyThreads(TtyConnection conn) {
        Map<Long, Long> topNThreads = ThreadUtil.getTopNThreads(sampleInterval, topNBusy);
        Long[] tids = topNThreads.keySet().toArray(new Long[topNThreads.keySet().size()]);

        ThreadInfo[] threadInfos = threadMXBean.getThreadInfo(ArrayUtils.toPrimitive(tids), true, true);
        if (threadInfos == null) {
            conn.write("thread do not exist! id: " + id + "\n");
        } else {
            for (ThreadInfo info : threadInfos) {
                String stacktrace = ThreadUtil.getFullStacktrace(info, topNThreads.get(info.getThreadId()));
                conn.write(stacktrace + "\n");
            }
        }
    }

    private void processAllThreads(TtyConnection conn) {
        Map<String, Thread> threads = ThreadUtil.getThreads();

        // 统计各种线程状态
        StringBuilder threadStat = new StringBuilder();
        Map<Thread.State, Integer> stateCountMap = new HashMap<Thread.State, Integer>();

        for (Thread.State s : Thread.State.values()) {
            stateCountMap.put(s, 0);
        }

        for (Thread thread : threads.values()) {
            Thread.State threadState = thread.getState();
            Integer count = stateCountMap.get(threadState);
            stateCountMap.put(threadState, count + 1);
        }

        threadStat.append("Threads Total: ").append(threads.values().size());
        for (Thread.State s : Thread.State.values()) {
            Integer count = stateCountMap.get(s);
            threadStat.append(", ").append(s.name()).append(": ").append(count);
        }

        String stat = RenderUtil.render(new LabelElement(threadStat), 120);
        String content = RenderUtil.render(threads.values().iterator(),
                new ThreadRenderer(sampleInterval), 120);
        conn.write(stat + content);
    }

    private void processThread(TtyConnection conn) {
        String content;

        ThreadInfo[] threadInfos = threadMXBean.getThreadInfo(new long[]{id}, true, true);
        if (threadInfos == null || threadInfos[0] == null) {
            content = "thread do not exist! id: " + id + "\n";
        } else {
            // no cpu usage info
            content = ThreadUtil.getFullStacktrace(threadInfos[0], -1);
        }
        conn.write(content);
    }
}
