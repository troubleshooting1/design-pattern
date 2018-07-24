package com.anji.designpatterndemo.staticfactorymethod;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 15:01
 */
public class AddOperation extends Operation {
    @Override
    public float getResult(float firstNumber, float secondNumber) {
        return firstNumber + secondNumber;
    }
}
