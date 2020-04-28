package chapter01;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class TryConcurrency {
    public static void main(String[] args) {
//        browseNews();
//        enjoyMusic();

//        new Thread() {
//            @Override
//            public void run() {
//                enjoyMusic();
//            }
//        }.start();
        // Java8 Lambda
        new Thread(TryConcurrency::enjoyMusic).start();
        browseNews();

    }

    private static void browseNews() {
        for (;;) {
            System.out.println("Uh-huh, the good news");
            sleep(1);
        }
    }

    private static void enjoyMusic() {
        for (;;) {
            System.out.println("Uh-huh, the nice music");
            sleep(1);
        }
    }

    private static void sleep(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
