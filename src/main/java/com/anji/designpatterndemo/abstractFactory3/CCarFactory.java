package com.anji.designpatterndemo.abstractFactory3;

import com.anji.designpatterndemo.abstractFactory3.detailcar.AudiCarC;
import com.anji.designpatterndemo.abstractFactory3.detailcar.BMWCarC;
import com.anji.designpatterndemo.abstractFactory3.detailcar.BenzCarC;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 15:53
 */
public class CCarFactory implements CarFactory {
    @Override
    public Car createCar(String carBrand) {
        switch(carBrand){
            case "BMW":
                return new BMWCarC();
            case "Benz":
                return new BenzCarC();
            default :
                return new AudiCarC();
        }
    }
}
