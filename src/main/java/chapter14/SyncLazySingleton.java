package chapter14;


public class SyncLazySingleton {
    private byte[] data = new byte[1024];
    private static SyncLazySingleton instance = null;
    private SyncLazySingleton() {}

    public static synchronized SyncLazySingleton getInstance() {
        if (instance == null) {
            instance = new SyncLazySingleton();
        }
        return instance;
    }
}
