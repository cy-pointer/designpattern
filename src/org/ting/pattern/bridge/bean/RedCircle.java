package org.ting.pattern.bridge.bean;

import org.ting.pattern.bridge.inter.DrawAPI;

/**
 * 实现DrawAPI接口的实体桥接实现类红圆
 *
 * @author 张韧炼
 * @create 2019-07-04 下午3:30
 **/
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x:" + x + "," + y + "]");
    }
}
