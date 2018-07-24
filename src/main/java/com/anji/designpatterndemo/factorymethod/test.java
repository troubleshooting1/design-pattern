package com.anji.designpatterndemo.factorymethod;

import com.anji.designpatterndemo.staticfactorymethod.Operation;

/**
 * Description: 工厂相当于黑盒子，策略相当于白盒子；
 * 使用工厂模式的时候更在意的是我需要一个实现了该接口的对象，具体的实现类内部有啥，工厂模式并不关心。
 * 策略模式更在意的是实现了该接口的子类内部的实现是什么，是否适合我现在的需求。
 * author: chenqiang
 * date: 2018/7/2 15:20
 */
public class test {
    public static void main(String[] args) {
        //客户端代码
        IFractory fractory = new AddOperationFactory();
        Operation operation = fractory.generateOper();
        System.out.println(operation.getResult(5, 6));
    }
}
