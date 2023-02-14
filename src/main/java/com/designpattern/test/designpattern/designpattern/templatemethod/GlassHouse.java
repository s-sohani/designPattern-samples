package com.designpattern.test.designpattern.designpattern.templatemethod;

public class GlassHouse extends HouseTemplate{
    @Override
    protected void buildWalls() {
        System.out.println("build glass walls");
    }
}
