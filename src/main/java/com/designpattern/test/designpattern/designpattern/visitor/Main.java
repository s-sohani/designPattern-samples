package com.designpattern.test.designpattern.designpattern.visitor;

public class Main {
    public static void main(String[] args) {
        ItemElement[] itemElements = {new Book("clean code", 100), new Fruit("apple", 20)};
        var visitor = new ShoppingCardVisitor();
        var sum = 0;
        for (var item : itemElements) {
            sum = sum + item.accept(visitor);
        }
        System.out.println(sum);
    }
}
