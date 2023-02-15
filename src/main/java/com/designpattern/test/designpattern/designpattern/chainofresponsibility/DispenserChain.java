package com.designpattern.test.designpattern.designpattern.chainofresponsibility;

public interface DispenserChain {
    void dispense(int amount);
    void setNextChain(DispenserChain next);
}
