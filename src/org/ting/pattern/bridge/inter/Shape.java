package org.ting.pattern.bridge.inter;

/**
 * @author 张韧炼
 * @create 2019-07-04 下午3:42
 **/
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
