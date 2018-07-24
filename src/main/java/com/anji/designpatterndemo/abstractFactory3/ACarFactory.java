package com.anji.designpatterndemo.abstractFactory3;

import com.anji.designpatterndemo.abstractFactory3.detailcar.AudiCarA;
import com.anji.designpatterndemo.abstractFactory3.detailcar.BMWCarA;
import com.anji.designpatterndemo.abstractFactory3.detailcar.BenzCarA;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 15:52
 */
public class ACarFactory implements CarFactory {
    @Override
    public Car createCar(String carBrand) {
        // TODO Auto-generated method stub
        switch(carBrand){
            case "BMW":
                return new BMWCarA();
            case "Benz":
                return new BenzCarA();
            default :
                return new AudiCarA();
        }
    }
}
