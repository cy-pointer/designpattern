package org.ting.pattern.absfactory.controller;

import org.ting.pattern.absfactory.factory.AbstractFactory;
import org.ting.pattern.absfactory.factory.ColorFactory;
import org.ting.pattern.absfactory.factory.ShapeFactory;

/**
 * @author 张韧炼
 * @create 2019-07-01 下午6:25
 **/
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
