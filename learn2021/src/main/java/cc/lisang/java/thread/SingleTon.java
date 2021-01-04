package cc.lisang.java.thread;

/**
 * 单例模式：饿汉线程安全
 */
public class SingleTon {
    private static final SingleTon instance = new SingleTon();

    private SingleTon() {
    }

    public static SingleTon getInstance() {
        return instance;
    }
}
