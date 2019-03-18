package com.github.jvm.agent.shell.future;

public class Future<T> {
    private boolean failed;
    private boolean succeeded;
    private T result;
    private Throwable throwable;

    public Future(T result) {
        complete(result);
    }

    public Future(Throwable t) {
        fail(t);
    }

    private void fail(Throwable t) {
        System.out.println("失败,抛出异常");
    }

    private void complete(T result) {
        System.out.println("成功,测试成功");
    }

    public static <T> Future<T> succeededFuture() {
        return new Future<T>((T) null);
    }

    public static <T> Future<T> succeededFuture(T result) {
        return new Future<T>(result);
    }

    public static <T> Future<T> failedFuture(Throwable t) {
        return new Future<T>(t);
    }

}
