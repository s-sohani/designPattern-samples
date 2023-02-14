package com.designpattern.test.designpattern.designpattern.templatemethod;

public class Main {
    public static void main(String[] args) {
        var woodenHouse = new WoodenHouse();
        var glassHouse = new GlassHouse();

        woodenHouse.buildHouse();
        glassHouse.buildHouse();
    }
}
