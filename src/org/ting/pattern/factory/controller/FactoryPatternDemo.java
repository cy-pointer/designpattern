package org.ting.pattern.factory.controller;

import org.ting.pattern.factory.Shape;

/**
 * @author 张韧炼
 * @create 2019-07-01 下午4:54
 **/
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        // 获取 Circle 的对象,并调用它的draw方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        // 调用 Circle 的draw 方法
        shape1.draw();
        // 获取 Rectangle 的对象,并调用它的draw方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        // 调用Rectangle 的draw 方法
        shape2.draw();
        // 获取 Square 的对象,并调用它的draw方法
        Shape shape3 = shapeFactory.getShape("SQUARE");
        // 调用 Square 的 draw 方法
        shape3.draw();
    }
}
