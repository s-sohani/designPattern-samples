package com.designpattern.test.designpattern.designpattern.bridge;

public class Square extends Shape{

    public Square(Color color) {
        super(color);
    }

    @Override
    public void printShape() {
        color.print();
        System.out.println("square");
    }
}
