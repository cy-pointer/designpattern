package org.ting.pattern.absfactory.factory;

import org.ting.pattern.absfactory.Color;
import org.ting.pattern.absfactory.Shape;
import org.ting.pattern.absfactory.entity.Circle;
import org.ting.pattern.absfactory.entity.Rectangle;
import org.ting.pattern.absfactory.entity.Square;

/**
 * @author 张韧炼
 * @create 2019-07-01 下午6:17
 **/
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
