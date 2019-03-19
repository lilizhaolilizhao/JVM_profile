package com.github.jvm.agent.shell.term;

import io.termd.core.tty.TtyConnection;

public abstract class TermServer {
    public abstract void setInReadline(boolean inReadline);

    public abstract void readline(TtyConnection conn);
}
