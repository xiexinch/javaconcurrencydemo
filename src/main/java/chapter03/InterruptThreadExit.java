package chapter03;

import java.util.concurrent.TimeUnit;

public class InterruptThreadExit {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println("I will start work");
                while (!isInterrupted()) {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        break;
                    }
                }
                System.out.println("I will be exiting");
            }
        };
        t.start();
        TimeUnit.MINUTES.sleep(1);
        System.out.println("System will be shutdown");
        t.interrupt();
    }
}
