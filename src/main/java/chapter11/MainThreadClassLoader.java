package chapter11;
import static java.lang.Thread.currentThread;

public class MainThreadClassLoader {
    public static void main(String[] args) {
        System.out.println(currentThread().getContextClassLoader());
    }
}
