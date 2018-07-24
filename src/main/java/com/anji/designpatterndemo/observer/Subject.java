package com.anji.designpatterndemo.observer;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/3 8:53
 */
public interface Subject {
    public void addObserver(Observer o);
    public void deleteObserver(Observer o);
    public void notifyObservers();
}
