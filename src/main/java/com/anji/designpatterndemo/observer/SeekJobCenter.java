package com.anji.designpatterndemo.observer;

import java.util.ArrayList;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/3 8:56
 */
public class SeekJobCenter implements Subject {
    String mess;
    boolean changed;
    ArrayList<Observer> personList;

    SeekJobCenter() {
        personList = new ArrayList<Observer>();
        mess = "";
        changed = false;
    }

    @Override
    public void addObserver(Observer o) {
        if (!(personList.contains(o))) {
            personList.add(o);
        }
    }

    @Override
    public void deleteObserver(Observer o) {
        if (personList.contains(o)) {
            personList.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        if (changed) {
            for (int i = 0; i < personList.size(); i++) {
                Observer observer = personList.get(i);
                observer.hearTelephone(mess);
            }
        }
    }

    public void getNewMess(String str) {
        if (str.equals(mess)) {
            changed = false;
        } else {
            mess = str;
            changed = true;
        }
    }
}
