package com.anji.designpatterndemo.proxy;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/4 9:51
 */
public class TriangleProxy implements Geometry {        //继承自接口

    double sideA, sideB, sideC;
    Triangle triangle;

    public void setABC(double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    @Override
    public double getArea() {
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            triangle = new Triangle(sideA, sideB, sideC);
            double area = triangle.getArea();     //让所代理的对象调用getArea()方法
            return area;
        } else {
            return -1;
        }
    }
}
