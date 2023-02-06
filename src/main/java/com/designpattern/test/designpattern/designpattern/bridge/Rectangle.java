package com.designpattern.test.designpattern.designpattern.bridge;

public class Rectangle extends Shape{

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void printShape() {
        color.print();
        System.out.println("rectangle");
    }
}
