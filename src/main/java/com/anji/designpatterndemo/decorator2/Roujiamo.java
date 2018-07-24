package com.anji.designpatterndemo.decorator2;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/4 9:14
 */
public class Roujiamo extends Pancake {

    public Roujiamo() {
        desc = "肉夹馍";
    }

    @Override
    public double price() {
        return 6;
    }

}