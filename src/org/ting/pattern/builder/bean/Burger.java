package org.ting.pattern.builder.bean;

import org.ting.pattern.builder.inter.Item;
import org.ting.pattern.builder.inter.Packing;
import org.ting.pattern.builder.pack.Wrapper;

/**
 * 汉堡抽象类
 *
 * @author 张韧炼
 * @create 2019-07-02 下午2:38
 **/
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
