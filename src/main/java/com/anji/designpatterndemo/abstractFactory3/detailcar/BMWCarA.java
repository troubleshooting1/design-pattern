package com.anji.designpatterndemo.abstractFactory3.detailcar;

import com.anji.designpatterndemo.abstractFactory3.Car;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 15:54
 */
public class BMWCarA implements Car {
    @Override
    public void getCarInfo() {
        System.out.println("BMW car from ACarFactory");
    }
}
