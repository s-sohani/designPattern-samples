package com.designpattern.test.designpattern.designpattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCard {
    private List<Item> items = new ArrayList<>();
    private Payment payment;

    public ShoppingCard(Payment payment) {
        this.payment = payment;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void pay() {
        var total = 0;
        for (var i : items) {
            total += i.getNumber();
        }
        payment.pay(total);
    }
}
