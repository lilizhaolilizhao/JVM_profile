package com.github.llz.agent;

public class App {
    public static void main(String[] args) throws InterruptedException {
        hello();

        Thread.sleep(Long.MAX_VALUE);
    }

    private static void hello() {
        System.out.println("this is a test");
    }
}
