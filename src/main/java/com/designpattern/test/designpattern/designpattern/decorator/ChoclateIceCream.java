package com.designpattern.test.designpattern.designpattern.decorator;

public class ChoclateIceCream extends IceCreamDecorator{
    public ChoclateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String makeIceCream() {
        return "chocolate" +super.makeIceCream();
    }
}
