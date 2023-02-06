package com.designpattern.test.designpattern.designpattern.bridge;

public abstract class Shape {
    Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void printShape();
}
