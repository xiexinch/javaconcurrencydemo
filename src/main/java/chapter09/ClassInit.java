package chapter09;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class ClassInit {
    static class Parent {
        static int value = 10;
        static {
            value = 20;
        }
    }

    static class Child extends Parent {
        static int i = value;
    }

    static {
        try {
            System.out.println("The classInit static code block will be invoke.");
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        IntStream.range(0, 5)
                .forEach(i -> new Thread(ClassInit::new));
        System.out.println(Child.i);
    }
}
