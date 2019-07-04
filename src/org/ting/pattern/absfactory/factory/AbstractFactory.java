package org.ting.pattern.absfactory.factory;

import org.ting.pattern.absfactory.Color;
import org.ting.pattern.absfactory.Shape;

/**
 * @author 张韧炼
 * @create 2019-07-01 下午6:12
 **/
public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
