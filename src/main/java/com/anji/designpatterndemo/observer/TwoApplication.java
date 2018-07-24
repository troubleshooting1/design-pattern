package com.anji.designpatterndemo.observer;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/3 9:09
 */
public class TwoApplication {
    public static void main(String[] args) {
        SeekJobCenter center=new SeekJobCenter();       //具体主题center
        UniversityStudent zhanglin=new UniversityStudent(center,"a.txt");
        HaiGui wanghao=new HaiGui(center,"b.txt");
        center.getNewMess("腾辉公司需要10个Java程序员");
        center.notifyObservers();                       //具体主题通知信息
        center.getNewMess("海景公司需要8个动画设计师。");
        center.notifyObservers();
        center.getNewMess("仁海公司需要9个电工。");
        center.notifyObservers();
        center.getNewMess("仁海公司需要9个电工。");            //信息不是新的
        center.notifyObservers();                       //观察者不会执行更新操作
    }
}
