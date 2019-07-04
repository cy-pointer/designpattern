package org.ting.pattern.builder;

import org.ting.pattern.builder.service.Meal;
import org.ting.pattern.builder.service.MealBuilder;

/**
 * 建造模式演示
 *
 * @author 张韧炼
 * @create 2019-07-02 下午2:59
 **/
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost:" + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost:" + nonVegMeal.getCost());
    }
}
