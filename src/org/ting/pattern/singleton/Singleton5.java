package org.ting.pattern.singleton;

/**
 * 5.登记式/静态内部类
 *
 * @author 张韧炼
 * @create 2019-07-02 上午11:17
 **/
public class Singleton5 {
    private static class SingletonHolder{
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5() {

    }
    public static final Singleton5 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
