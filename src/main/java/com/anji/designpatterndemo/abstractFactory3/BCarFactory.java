package com.anji.designpatterndemo.abstractFactory3;

import com.anji.designpatterndemo.abstractFactory3.detailcar.AudiCarB;
import com.anji.designpatterndemo.abstractFactory3.detailcar.BMWCarB;
import com.anji.designpatterndemo.abstractFactory3.detailcar.BenzCarB;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 15:52
 */
public class BCarFactory implements CarFactory {
    @Override
    public Car createCar(String carBrand) {
        switch(carBrand){
            case "BMW":
                return new BMWCarB();
            case "Benz":
                return new BenzCarB();
            default :
                return new AudiCarB();
        }
    }
}
