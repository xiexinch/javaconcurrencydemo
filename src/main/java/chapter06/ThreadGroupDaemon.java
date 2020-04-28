package chapter06;

import java.util.concurrent.TimeUnit;

public class ThreadGroupDaemon {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group1 = new ThreadGroup("Group1");
        new Thread(group1, () -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "group1-thread1").start();
    }
}
