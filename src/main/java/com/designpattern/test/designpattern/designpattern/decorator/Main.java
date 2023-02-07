package com.designpattern.test.designpattern.designpattern.decorator;

public class Main {
    public static void main(String[] args) {
        var iceCream = new ChoclateIceCream(new HoneyIceCream(new BaseIceCream()));
        iceCream.makeIceCream();
    }
}
