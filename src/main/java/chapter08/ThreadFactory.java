package chapter08;

/**
 * 创建线程的工厂
 * */
@FunctionalInterface
public interface ThreadFactory {
    Thread createThread(Runnable runnable);
}
