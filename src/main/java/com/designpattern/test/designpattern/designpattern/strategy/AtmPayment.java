package com.designpattern.test.designpattern.designpattern.strategy;

public class AtmPayment implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("pay with atm: " + amount);
    }
}
