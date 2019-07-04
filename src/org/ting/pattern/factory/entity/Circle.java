package org.ting.pattern.factory.entity;

import org.ting.pattern.factory.Shape;

/**
 * @author 张韧炼
 * @create 2019-07-01 下午4:46
 **/
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
