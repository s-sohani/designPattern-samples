package com.reactive.test.reactor.designpattern.observer;

public class BinaryObserver implements MyObserver{
    @Override
    public void doUpdate(String str) {
        System.out.println("binary observer" + str);
    }
}
