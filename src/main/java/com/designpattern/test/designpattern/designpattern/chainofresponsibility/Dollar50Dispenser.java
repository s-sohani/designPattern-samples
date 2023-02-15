package com.designpattern.test.designpattern.designpattern.chainofresponsibility;

public class Dollar50Dispenser implements DispenserChain{
    private DispenserChain dispenserChain;

    @Override
    public void dispense(int amount) {
        if (amount >= 50) {
            var remain = amount % 50;
            var num = amount / 50;
            System.out.println("number of 50 is " + num);
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
