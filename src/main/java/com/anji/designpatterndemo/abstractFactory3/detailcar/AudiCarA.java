package com.anji.designpatterndemo.abstractFactory3.detailcar;

import com.anji.designpatterndemo.abstractFactory3.Car;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 15:53
 */
public class AudiCarA implements Car {
    @Override
    public void getCarInfo() {
        System.out.println("Audi car from ACarFactory");
    }
}
