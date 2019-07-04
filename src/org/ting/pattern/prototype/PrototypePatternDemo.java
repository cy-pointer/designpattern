package org.ting.pattern.prototype;

import org.ting.pattern.prototype.entity.Rectangle;
import org.ting.pattern.prototype.entity.Shape;
import org.ting.pattern.prototype.entity.ShapeCache;

/**
 * 示例
 *
 * @author 张韧炼
 * @create 2019-07-02 下午4:25
 **/
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape:" + clonedShape.getType());
        clonedShape.draw();

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape:" + clonedShape2.getType());
        clonedShape2.draw();

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shage:" + clonedShape3.getType());
        clonedShape3.draw();
    }
}
