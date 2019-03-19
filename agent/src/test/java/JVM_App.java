public class JVM_App {
    public static void main(String[] args) throws InterruptedException {
        JVM_App app = new JVM_App();

        for (int i = 0; i < 10000; i++) {
            try {
                int hello = app.hello(i);

                System.out.println(hello);
            } catch (Exception e) {
                e.printStackTrace();
            }

            Thread.sleep(10000L);
        }
        Thread.sleep(Long.MAX_VALUE);
    }

    private int hello(int i) {
//        return i + 100;
        return i / (i - 5);
    }
}
