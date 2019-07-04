package org.ting.pattern.singleton;

/**
 * 2.懒汉式,线程安全
 *
 * @author 张韧炼
 * @create 2019-07-02 上午11:03
 **/
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2() {
    }

    private static synchronized Singleton2 getInstance() {
        if (instance==null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
