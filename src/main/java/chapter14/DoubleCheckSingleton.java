package chapter14;

import java.net.Socket;
import java.sql.Connection;

/**
 * 初始化conn 和 socket需要花时间
 * 当线程1初始化instance之后，线程2再访问instance的conn或socket，此时conn或socket未初始化，会产生空指针异常
 * */
public final class DoubleCheckSingleton {
    private byte[] data = new byte[1024];
    private static DoubleCheckSingleton instance = null;

    Connection conn;
    Socket socket;

    private DoubleCheckSingleton() {
        // 初始化 conn
        // 初始化 socket
    }
    public static DoubleCheckSingleton getInstance() {
        if (null == instance) {
            synchronized (DoubleCheckSingleton.class) {
                if (null == instance) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
