package org.ting.pattern.builder.service;

import org.ting.pattern.builder.bean.ChickenBurger;
import org.ting.pattern.builder.bean.Coke;
import org.ting.pattern.builder.bean.Pepsi;
import org.ting.pattern.builder.bean.VegBurger;

/**
 * 套餐创建
 *
 * @author 张韧炼
 * @create 2019-07-02 下午2:55
 **/
public class MealBuilder {
    /**
     * 素食菜单
     *
     * @return
     */
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * 非素食菜单
     *
     * @return
     */
    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
