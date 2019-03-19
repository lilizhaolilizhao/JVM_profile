package com.github.jvm.agent.handlers;

public interface Handler<E> {
    void handle(E event);
}
