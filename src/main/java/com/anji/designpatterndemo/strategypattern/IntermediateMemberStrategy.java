package com.anji.designpatterndemo.strategypattern;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 16:47
 */
public class IntermediateMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("对于中级会员的折扣为10%");
        return booksPrice * 0.9;
    }
}
