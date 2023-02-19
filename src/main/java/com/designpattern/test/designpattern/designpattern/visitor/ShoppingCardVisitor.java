package com.designpattern.test.designpattern.designpattern.visitor;

public class ShoppingCardVisitor implements Visitor{
    @Override
    public int visit(Book book) {
        if(book.getPrice() > 50) {
            return book.getPrice() / 2;
        }
        return book.getPrice();
    }

    @Override
    public int visit(Fruit fruit) {
        return fruit.getPrice();
    }
}
