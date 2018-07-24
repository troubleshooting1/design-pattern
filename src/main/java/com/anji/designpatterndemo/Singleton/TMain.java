package com.anji.designpatterndemo.Singleton;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 10:08
 */
public class TMain {
    public static void main(String[] args) {
        TestSingleton ts1 = TestSingleton.getInstance();
        ts1.setName("jason");

        TestSingleton ts2 = TestSingleton.getInstance();
        ts2.setName("0539");

        ts1.printInfo();
        ts2.printInfo();

        if(ts1 == ts2){
            System.out.println("创建的是同一个实例");
        }else{
            System.out.println("创建的不是同一个实例");
        }

    }
}
