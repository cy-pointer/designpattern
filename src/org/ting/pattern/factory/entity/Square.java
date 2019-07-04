package org.ting.pattern.factory.entity;

import org.ting.pattern.factory.Shape;

/**
 * @author 张韧炼
 * @create 2019-07-01 下午4:44
 **/
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
