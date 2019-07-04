package org.ting.pattern.factory.controller;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.ting.pattern.factory.Shape;
import org.ting.pattern.factory.entity.Circle;
import org.ting.pattern.factory.entity.Rectangle;
import org.ting.pattern.factory.entity.Square;

/**
 * @author 张韧炼
 * @create 2019-07-01 下午4:48
 **/
public class ShapeFactory {
    /**
     * 使用 getShape 方法获取形状类型的对象
     *
     * @param shapeType 形状类型
     * @return 形状实例
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
