package org.ting.pattern.absfactory.factory;

import org.ting.pattern.absfactory.Color;
import org.ting.pattern.absfactory.Shape;
import org.ting.pattern.absfactory.entity.Blue;
import org.ting.pattern.absfactory.entity.Green;
import org.ting.pattern.absfactory.entity.Red;

/**
 * @author 张韧炼
 * @create 2019-07-01 下午6:23
 **/
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color==null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
