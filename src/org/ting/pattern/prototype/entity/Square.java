package org.ting.pattern.prototype.entity;

/**
 * 方形
 *
 * @author 张韧炼
 * @create 2019-07-02 下午4:10
 **/
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
