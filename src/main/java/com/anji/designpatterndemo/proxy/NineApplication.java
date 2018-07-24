package com.anji.designpatterndemo.proxy;

import java.util.Scanner;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/4 9:55
 */
public class NineApplication {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入三个数，每输入一个数按回车确认：");
        double a, b, c;
        a = reader.nextDouble();
        b = reader.nextDouble();
        c = reader.nextDouble();
        TriangleProxy proxy = new TriangleProxy();
        proxy.setABC(a, b, c);
        double area = proxy.getArea();
        System.out.println("面积是：" + area);
    }
}
