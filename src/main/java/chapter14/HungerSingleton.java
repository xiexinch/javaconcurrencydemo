package chapter14;

public final class HungerSingleton {
    // 实例变量
    private byte[] data = new byte[1024];

    // 实例对象
    private static HungerSingleton instance = new HungerSingleton();

    // 私有构造函数 不允许外部new
    private HungerSingleton() {}

    public static HungerSingleton getInstance() {
        return instance;
    }
}
