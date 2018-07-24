package com.anji.designpatterndemo.abstractFactory3.detailcar;

import com.anji.designpatterndemo.abstractFactory3.Car;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 15:55
 */
public class BenzCarB implements Car {
    @Override
    public void getCarInfo() {
        System.out.println("Benz car from BCarFactory");
    }
}
