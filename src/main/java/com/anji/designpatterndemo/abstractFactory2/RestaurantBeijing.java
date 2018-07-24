package com.anji.designpatterndemo.abstractFactory2;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 15:41
 */
public class RestaurantBeijing extends AbstractFactory {
    @Override
    public Eat createRestaurantEat() {
        return new EatBeijing();
    }
    @Override
    public Drink createRestaurantDrink() {
        return new DrinkBeijing();
    }

}
