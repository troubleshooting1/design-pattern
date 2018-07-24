package com.anji.designpatterndemo.strategypattern;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 16:48
 */
public class AdvancedMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("对于高级会员的折扣为20%");
        return  booksPrice * 0.8;
    }
}
