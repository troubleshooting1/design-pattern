package com.anji.designpatterndemo.strategypattern;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 16:49
 */
public class Price {
    private MemberStrategy strategy;

    public Price(MemberStrategy strategy){
        this.strategy=strategy;
    }

    public double quote(double booksPrice){
        return this.strategy.calcPrice(booksPrice);
    }
}
