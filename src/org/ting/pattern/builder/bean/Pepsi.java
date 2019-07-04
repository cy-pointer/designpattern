package org.ting.pattern.builder.bean;

/**
 * 百事可乐
 *
 * @author 张韧炼
 * @create 2019-07-02 下午2:46
 **/
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
