package chapter14;

public final class HolderSingleton {
    private byte[] data = new byte[1024];

    private HolderSingleton() {}

    // 在静态内部类中持有Singleton实例，并且可被直接初始化
    private static class Holder {
        private static HolderSingleton instance = new HolderSingleton();
    }

    // 获取Holder的内部属性
    public static HolderSingleton getInstance() {
        return Holder.instance;
    }

}
