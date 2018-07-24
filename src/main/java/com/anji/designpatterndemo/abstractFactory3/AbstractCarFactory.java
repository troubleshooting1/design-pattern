package com.anji.designpatterndemo.abstractFactory3;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 15:51
 */
public class AbstractCarFactory {
    //根据carType创建具体工厂
    public static CarFactory getCarFactory(String carType){
        switch(carType){
            case "A":
                return new ACarFactory();
            case "B":
                return new BCarFactory();
            default :
                return new CCarFactory();
        }
    }
}
