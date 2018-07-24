package com.anji.designpatterndemo.decorator2;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/4 9:17
 */
public class MyTest {
    public static void main(String[] args) {
        Pancake tornCake = new TornCake();          //定义具体组件
        //手抓饼基础价
        System.out.println(String.format("%s ￥%s", tornCake.getDesc(), tornCake.price()));

        Pancake roujiamo = new Roujiamo();          //定义具体组件
        roujiamo = new FiredEgg(roujiamo);          //将具体组件作为参数传递
        roujiamo = new Ham(roujiamo);

        //我好饿
        System.out.println(String.format("%s ￥%s", roujiamo.getDesc(), roujiamo.price()));
    }
}
