package org.ting.pattern.builder.bean;

/**
 * 可口可乐
 *
 * @author 张韧炼
 * @create 2019-07-02 下午2:45
 **/
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
