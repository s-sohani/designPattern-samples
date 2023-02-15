package com.designpattern.test.designpattern.designpattern.strategy;

public class Main {
    public static void main(String[] args) {
        var item1 = new Item("item1", 100);
        var item2 = new Item("item2", 200);
        var card = new ShoppingCard(new AtmPayment());
        card.addItem(item1);
        card.addItem(item2);
        card.pay();
    }
}
