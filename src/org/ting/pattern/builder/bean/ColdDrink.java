package org.ting.pattern.builder.bean;

import org.ting.pattern.builder.inter.Item;
import org.ting.pattern.builder.inter.Packing;
import org.ting.pattern.builder.pack.Bottle;

/**
 * 饮料抽象类
 *
 * @author 张韧炼
 * @create 2019-07-02 下午2:40
 **/
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
