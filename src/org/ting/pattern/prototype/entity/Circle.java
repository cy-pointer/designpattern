package org.ting.pattern.prototype.entity;

/**
 * 圆
 *
 * @author 张韧炼
 * @create 2019-07-02 下午4:12
 **/
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
