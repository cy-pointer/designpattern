package org.ting.pattern.bridge.bean;

import org.ting.pattern.bridge.inter.DrawAPI;
import org.ting.pattern.bridge.inter.Shape;

/**
 * 实现了Shape接口的实体类
 *
 * @author 张韧炼
 * @create 2019-07-04 下午3:44
 **/
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
