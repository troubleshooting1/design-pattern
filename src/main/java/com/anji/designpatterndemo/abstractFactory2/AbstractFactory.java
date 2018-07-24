package com.anji.designpatterndemo.abstractFactory2;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 15:40
 */
public abstract class AbstractFactory {
    public abstract Eat createRestaurantEat();
    public abstract Drink createRestaurantDrink();
}
