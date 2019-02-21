package com.github.llz.agent;

public class App {
    public static final String UDASMCN = "com/github/llz/agent/App";

    public static void main(String[] args) throws InterruptedException {
        hello();

        Thread.sleep(Long.MAX_VALUE);
    }

    private static void hello() {
        long l = System.nanoTime();


        l = System.nanoTime() - l;
        System.out.println(l);
//        System.out.println(UDASMCN + "  hello:" + l);
    }
}
