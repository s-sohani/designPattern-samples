package com.designpattern.test.designpattern.designpattern.chainofresponsibility;

public class Dollar10Dispense implements DispenserChain{
    private DispenserChain dispenserChain;
    @Override
    public void dispense(int amount) {
        if (amount >= 10) {
            var remain = amount % 10;
            var num = amount / 10;
            System.out.println("num of 10 dollar is " + num);
            if (remain != 0 ) {
                dispenserChain.dispense(remain);
            }
        } else {
            dispenserChain.dispense(amount);
        }
    }

    @Override
    public void setNextChain(DispenserChain next) {
        this.dispenserChain = next;
    }
}
