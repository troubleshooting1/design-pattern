package com.anji.designpatterndemo.decorator2;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/4 9:17
 */
public class Ham extends Condiment {
    private Pancake pancake;

    public Ham(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public String getDesc() {
        return pancake.getDesc() + ", 火腿片";
    }

    @Override
    public double price() {
        return pancake.price() + 1.5;
    }

}
