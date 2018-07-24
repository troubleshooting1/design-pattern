package com.anji.designpatterndemo.strategypattern;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 16:50
 */
public class Client {
    public static void main(String[] args) {
        // 选择并创建需要使用的策略对象
        MemberStrategy strategy = new AdvancedMemberStrategy();

        Price price = new Price(strategy);

        double quote = price.quote(300);
        System.out.println("图书的最终价格为：" + quote);
    }
}
