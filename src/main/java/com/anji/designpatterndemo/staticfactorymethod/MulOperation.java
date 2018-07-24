package com.anji.designpatterndemo.staticfactorymethod;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 15:03
 */
public class MulOperation extends Operation {
    @Override
    public float getResult(float firstNumber, float secondNumber) {
        return firstNumber * secondNumber;
    }
}
