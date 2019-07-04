package org.ting.pattern.builder.bean;

/**
 * 蔬菜汉堡
 *
 * @author 张韧炼
 * @create 2019-07-02 下午2:41
 **/
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
