package org.ting.pattern.absfactory.entity;

import org.ting.pattern.absfactory.Color;

/**
 * @author 张韧炼
 * @create 2019-07-01 下午6:10
 **/
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
