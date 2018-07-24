package com.anji.designpatterndemo.strategypattern.model;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 16:38
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy=strategy;
    }

    public void contextInterface(){
        strategy.strategyInterface();
    }
}
