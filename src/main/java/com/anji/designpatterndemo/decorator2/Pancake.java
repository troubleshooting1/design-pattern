package com.anji.designpatterndemo.decorator2;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/4 9:13
 */
public abstract class Pancake {
    public String desc = "我不是一个具体的煎饼";

    public String getDesc() {
        return desc;
    }

    public abstract double price();
}
