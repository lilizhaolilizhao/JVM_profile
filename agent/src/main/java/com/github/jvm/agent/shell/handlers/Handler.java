package com.github.jvm.agent.shell.handlers;

public interface Handler<E> {
    void handle(E event);
}
