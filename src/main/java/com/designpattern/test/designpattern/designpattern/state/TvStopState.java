package com.designpattern.test.designpattern.designpattern.state;

public class TvStopState implements State{
    @Override
    public void doAction() {
        System.out.println("tv stop state");
    }
}
