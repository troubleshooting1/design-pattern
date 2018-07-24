package com.anji.designpatterndemo.abstractFactory2;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 15:42
 */
public class test {
    public static void main(String[] args) {
        //北京分店餐馆
        //多态：创建工厂实现类
        AbstractFactory abstractFactory=new RestaurantBeijing();
        //多态：具体工厂实现类创建eat的具体实现
        Eat createRestaurantEat = abstractFactory.createRestaurantEat();
        //调用方法
        createRestaurantEat.eat();

        Drink createRestaurantDrink = abstractFactory.createRestaurantDrink();
        createRestaurantDrink.drink();
    }

}
