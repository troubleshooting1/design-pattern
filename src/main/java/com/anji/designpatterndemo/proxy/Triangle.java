package com.anji.designpatterndemo.proxy;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/4 9:48
 */
public class Triangle implements Geometry {
    double sideA, sideB, sideC, area;

    public Triangle(double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    @Override
    public double getArea() {
        double p = (sideA + sideB + sideC) / 2.0;
        area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return area;
    }
}
