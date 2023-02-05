package com.reactive.test.reactor.designpattern.observer;

public class HexObserver implements MyObserver{
    @Override
    public void doUpdate(String str) {
        System.out.println("hex observer " + str);
    }
}
