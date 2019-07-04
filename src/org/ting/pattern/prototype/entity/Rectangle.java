package org.ting.pattern.prototype.entity;

/**
 * 矩形
 *
 * @author 张韧炼
 * @create 2019-07-02 下午4:02
 **/
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
