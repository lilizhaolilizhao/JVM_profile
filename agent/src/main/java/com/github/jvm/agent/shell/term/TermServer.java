package com.github.jvm.agent.shell.term;

import com.github.jvm.agent.handlers.Handler;
import com.github.jvm.agent.shell.future.Future;
import io.termd.core.tty.TtyConnection;

public abstract class TermServer {
    public abstract void setInReadline(boolean inReadline);

    public abstract void readline(TtyConnection conn);

    public abstract void close();

    public abstract void close(Handler<Future<Void>> completionHandler);
}
