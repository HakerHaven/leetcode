package cc.lisang.java.thread;

/**
 * 单例模式：懒汉线程不安全
 * @author lisang
 */
public class SingleTon3 {
    private static SingleTon3 instance;

    private SingleTon3() {
    }

    public static synchronized SingleTon3 getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new SingleTon3();
        }
        return instance;
    }
}
