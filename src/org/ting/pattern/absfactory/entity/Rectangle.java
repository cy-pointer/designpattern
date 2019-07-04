package org.ting.pattern.absfactory.entity;

import org.ting.pattern.absfactory.Shape;

/**
 * @author 张韧炼
 * @create 2019-07-01 下午6:05
 **/
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
