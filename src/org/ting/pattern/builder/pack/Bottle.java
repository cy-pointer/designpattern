package org.ting.pattern.builder.pack;

import org.ting.pattern.builder.inter.Packing;

/**
 * 瓶子装
 *
 * @author 张韧炼
 * @create 2019-07-02 下午2:19
 **/
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
