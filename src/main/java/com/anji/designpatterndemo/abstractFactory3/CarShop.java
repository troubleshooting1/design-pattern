package com.anji.designpatterndemo.abstractFactory3;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 15:51
 */
public class CarShop {
    private Car car;

    public CarShop(Car car) {
        this.car = car;
    }

    //获得汽车的相关信息
    public void getCarInfo() {
        car.getCarInfo();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //通过抽象工厂获得具体工厂
        CarFactory cf = AbstractCarFactory.getCarFactory("A");
        //通过具体工厂创建具体car对象并传递给构造器
        CarShop cs = new CarShop(cf.createCar("BMW"));
        cs.getCarInfo();
    }
}
