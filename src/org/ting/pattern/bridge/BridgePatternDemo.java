package org.ting.pattern.bridge;

import org.ting.pattern.bridge.bean.Circle;
import org.ting.pattern.bridge.bean.GreenCircle;
import org.ting.pattern.bridge.bean.RedCircle;

/**
 * 使用Shape和DrawAPI类画出不同颜色的圆
 *
 * @author 张韧炼
 * @create 2019-07-04 下午3:47
 **/
public class BridgePatternDemo {
    public static void main(String[] args) {
        Circle redCircle = new Circle(100, 100, 10, new RedCircle());
        Circle greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
