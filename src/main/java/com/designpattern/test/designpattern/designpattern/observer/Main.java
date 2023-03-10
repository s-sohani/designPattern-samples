package com.designpattern.test.designpattern.designpattern.observer;

public class Main {
    public static void main(String[] args) {
        var subject = new Subject();
        subject.registerObserver(new HexObserver());
        subject.registerObserver(new BinaryObserver());

        subject.setState("test");
    }
}
