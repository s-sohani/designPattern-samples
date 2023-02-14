package com.designpattern.test.designpattern.designpattern.templatemethod;

public class WoodenHouse extends HouseTemplate{
    @Override
    protected void buildWalls() {
        System.out.println("build wooden walls");
    }
}
