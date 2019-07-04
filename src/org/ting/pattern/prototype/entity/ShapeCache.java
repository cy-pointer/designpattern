package org.ting.pattern.prototype.entity;

import org.ting.pattern.prototype.entity.Shape;

import java.util.Hashtable;

/**
 * 用于缓存
 *
 * @author 张韧炼
 * @create 2019-07-02 下午4:14
 **/
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    /**
     * 对每种形状者运行数据库查询,并创建该形状
     * shapeMap.put(shapeKey,shape);
     * 例如,我们要添加三种
     */
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}