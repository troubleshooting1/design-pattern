package com.anji.designpatterndemo.decorator;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/4 9:02
 */
public abstract class Decorator extends Bird {       //!!!!!!!!抽象装饰者需要继承自抽象组件

    protected Bird bird;

    public Decorator() {

    }

    public Decorator(Bird bird) {
        this.bird = bird;
    }

//    @Override
//    public int fly() {
//        return 0;
//    }
}
