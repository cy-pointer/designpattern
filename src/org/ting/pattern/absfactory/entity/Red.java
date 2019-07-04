package org.ting.pattern.absfactory.entity;

import org.ting.pattern.absfactory.Color;

/**
 * @author 张韧炼
 * @create 2019-07-01 下午6:09
 **/
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
