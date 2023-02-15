package com.designpattern.test.designpattern.designpattern.chainofresponsibility;

public class Dollar20Dispense implements DispenserChain{
    private DispenserChain dispenserChain;

    @Override
    public void dispense(int amount) {
        if (amount >= 20) {
            var remain = amount % 20;
            var num = amount / 20;
            System.out.println("number of 20 dollar is " + num);
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
