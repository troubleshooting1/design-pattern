package com.anji.designpatterndemo.decorator;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/4 9:01
 */
public class Sparrow extends Bird {
    public final int DISTANCE=100;

    @Override
    public int fly() {
        return DISTANCE;
    }
}
