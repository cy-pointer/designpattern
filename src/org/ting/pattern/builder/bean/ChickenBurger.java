package org.ting.pattern.builder.bean;

/**
 * 鸡肉汉堡
 *
 * @author 张韧炼
 * @create 2019-07-02 下午2:44
 **/
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
