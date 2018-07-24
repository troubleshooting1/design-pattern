package com.anji.designpatterndemo.staticfactorymethod;

import java.util.Scanner;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 15:07
 */
public class Computer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        float firstNum = in.nextFloat();
        System.out.println("请输入第二个数字:");
        float secondNum = in.nextFloat();
        System.out.println("请输入运算符号：");
        String countQuota = in.next();
        System.out.println(count(firstNum, secondNum, countQuota));
    }

    private static float count(float firstNum, float secondNum, String countQuota) {
        //通过工厂类获取对象
        Operation operation = OperationFactory.getOperation(countQuota);
        return operation.getResult(firstNum, secondNum);
    }
}
