package chapter14;

import java.net.Socket;
import java.sql.Connection;

/**
 * 初始化conn 和 socket需要花时间
 * 当线程1初始化instance之后，线程2再访问instance的conn或socket，此时conn或socket未初始化，会产生空指针异常
 * 给instance加上volatile可以避免指令重排，可以避免conn和socket的实例化排在instance之后
 * */
public final class VolatileDoubleCheckSingleton {
    private byte[] data = new byte[1024];
    private static volatile VolatileDoubleCheckSingleton instance = null;

    Connection conn;
    Socket socket;

    private VolatileDoubleCheckSingleton() {
        // 初始化 conn
        // 初始化 socket
    }
    public static VolatileDoubleCheckSingleton getInstance() {
        if (null == instance) {
            synchronized (DoubleCheckSingleton.class) {
                if (null == instance) {
                    instance = new VolatileDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
