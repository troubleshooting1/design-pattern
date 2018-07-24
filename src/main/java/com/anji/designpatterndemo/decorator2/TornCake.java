package com.anji.designpatterndemo.decorator2;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/4 9:14
 */
public class TornCake extends Pancake  {
    public TornCake() {
        desc = "手抓饼";
    }

    @Override
    public double price() {
        return 4;
    }

}
