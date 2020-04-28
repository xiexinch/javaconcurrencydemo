package chapter03;

import static java.lang.Thread.sleep;

public class ThreadSleep {
    public static void main(String[] args) {
        new Thread(() -> {
            long startTime = System.currentTimeMillis();
            sleep(2_00L);
            long endTime = System.currentTimeMillis();
            System.out.println(String.format("Total spend %d ms", (endTime - startTime)));
        }).start();

        long startTime = System.currentTimeMillis();
        sleep(3_00L);
        long endTime = System.currentTimeMillis();
        System.out.println(String.format("Main thread total spend %d ms", (endTime - startTime)));

    }

    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {

        }
    }
}
