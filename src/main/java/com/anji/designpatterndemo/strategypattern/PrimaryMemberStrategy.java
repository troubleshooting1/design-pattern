package com.anji.designpatterndemo.strategypattern;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 16:47
 */
public class PrimaryMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("初级会员没有折扣");
        return booksPrice;
    }
}
