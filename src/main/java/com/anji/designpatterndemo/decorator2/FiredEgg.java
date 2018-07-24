package com.anji.designpatterndemo.decorator2;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/4 9:16
 */
public class FiredEgg extends Condiment {
    private Pancake pancake;

    public FiredEgg(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public String getDesc() {
        return pancake.getDesc() + ", 煎蛋";
    }

    @Override
    public double price() {
        return pancake.price() + 2;
    }
}
