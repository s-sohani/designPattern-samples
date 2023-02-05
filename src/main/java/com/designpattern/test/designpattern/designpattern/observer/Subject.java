package com.designpattern.test.designpattern.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<MyObserver> observerList;
    private String state = "";

    public Subject() {
        observerList = new ArrayList<>();
    }

    public void registerObserver(MyObserver observer) {
        observerList.add(observer);
    }

    public void setState(String str) {
        this.state = str;
        notifyObserver();
    }

    private void notifyObserver() {
        for (var ob : observerList) {
            ob.doUpdate(this.state);
        }
    }
}
