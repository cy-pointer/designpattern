package org.ting.pattern.builder.service;

import org.ting.pattern.builder.inter.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * 餐
 *
 * @author 张韧炼
 * @create 2019-07-02 下午2:47
 **/
public class Meal {
    private List<Item> items = new ArrayList<>(16);

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item:" + item.name());
            System.out.print(",Packing:" + item.packing().pack());
            System.out.println(",Price:" + item.price());
        }
    }
}
