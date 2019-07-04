package org.ting.pattern.singleton;

/**
 * 4.双栓锁/双重校验锁(DCL,即double-checked locking)
 *
 * @author 张韧炼
 * @create 2019-07-02 上午11:09
 **/
public class Singleton4 {
    private volatile static Singleton4 instance;

    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        if (instance==null) {
            synchronized (Singleton4.class) {
                if (instance==null) {
                    return new Singleton4();
                }
            }
        }
        return instance;
    }
}
