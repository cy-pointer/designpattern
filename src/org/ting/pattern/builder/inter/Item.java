package org.ting.pattern.builder.inter;

/**
 * 商品名字包装价格
 *
 * @author 张韧炼
 * @create 2019-07-02 下午2:12
 **/
public interface Item {
    String name();

    Packing packing();

    float price();
}
