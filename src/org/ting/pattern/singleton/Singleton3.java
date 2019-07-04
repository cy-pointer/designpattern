package org.ting.pattern.singleton;

/**
 * 3.饿汉式
 *
 * @author 张韧炼
 * @create 2019-07-02 上午11:07
 **/
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return instance;
    }
}
