package com.anji.designpatterndemo.abstractFactory2;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 15:46
 */
public class RestaurantShanghai extends AbstractFactory  {
    @Override
    public Eat createRestaurantEat() {
        return new EatShanghai();
    }

    @Override
    public Drink createRestaurantDrink() {
        return new DrinkShanghai();
    }
}
