package com.designpattern.test.designpattern.designpattern.strategy;

public class Cache implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("pay with cache: " + amount);
    }
}
