package com.anji.designpatterndemo.decorator;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/4 9:03
 */
public class SparrowDecorator extends Decorator {           //
    public final int DISTANCE = 50;

    SparrowDecorator(Bird bird) {
        super(bird);
    }

    public int fly() {
        int distance = 0;
        distance = bird.fly() + eleFly();
        return distance;
    }

    private int eleFly() {
        return DISTANCE;
    }
}
