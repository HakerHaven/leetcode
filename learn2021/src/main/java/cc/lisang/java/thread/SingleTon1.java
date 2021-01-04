package cc.lisang.java.thread;

/**
 * 单例模式：饿汉线程安全(变种)
 * @author lisang
 */
public class SingleTon1 {
    private static final SingleTon1 instance;

    static {
        instance = new SingleTon1();
    }

    private SingleTon1() {
    }

    public static SingleTon1 getInstance() {
        return instance;
    }
}
