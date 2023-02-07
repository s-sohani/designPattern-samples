package com.designpattern.test.designpattern.designpattern.decorator;

public class HoneyIceCream extends IceCreamDecorator {

    public HoneyIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String makeIceCream() {
        return "add hone" + super.makeIceCream();
    }
}
