package com.designpattern.test.designpattern.designpattern.bridge;

public class Main {
    public static void main(String[] args) {
        var shape = new Rectangle(new RedColor());
        shape.printShape();
        var shape2 = new Square(new GreenColor());
        shape2.printShape();
    }
}
