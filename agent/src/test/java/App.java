public class App {
    public static void main(String[] args) throws InterruptedException {
        App app = new App();

        for (int i = 0; i < 10000; i++) {
            int hello = app.hello(i);

            System.out.println(hello);

            Thread.sleep(10000L);
        }
        Thread.sleep(Long.MAX_VALUE);
    }

    private int hello(int i) {
        return i + 100;
    }
}
