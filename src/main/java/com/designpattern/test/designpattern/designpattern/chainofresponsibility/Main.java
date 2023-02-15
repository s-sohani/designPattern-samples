package com.designpattern.test.designpattern.designpattern.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        DispenserChain dollar50 = new Dollar50Dispenser();
        DispenserChain dollar20 = new Dollar20Dispense();
        DispenserChain dollar10 = new Dollar10Dispense();
        dollar50.setNextChain(dollar20);
        dollar20.setNextChain(dollar10);

        dollar50.dispense(520);
        dollar20.dispense(20);
    }
}
