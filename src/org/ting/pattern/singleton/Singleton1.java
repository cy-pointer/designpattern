package org.ting.pattern.singleton;

/**
 * 1.懒汉式,线程不安全
 *
 * @author 张韧炼
 * @create 2019-07-02 上午10:59
 **/
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
