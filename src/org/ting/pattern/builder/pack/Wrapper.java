package org.ting.pattern.builder.pack;

import org.ting.pattern.builder.inter.Packing;

/**
 * 纸包装
 *
 * @author 张韧炼
 * @create 2019-07-02 下午2:18
 **/
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
