package cc.lisang.java.thread;

/**
 * 单例模式：懒汉线程不安全
 * @author lisang
 */
public class SingleTon2 {
    private static SingleTon2 instance;

    private SingleTon2() {
    }

    public static SingleTon2 getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new SingleTon2();
        }
        return instance;
    }
}
