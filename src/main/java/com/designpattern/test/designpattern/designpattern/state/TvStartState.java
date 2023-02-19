package com.designpattern.test.designpattern.designpattern.state;

public class TvStartState implements State{
    @Override
    public void doAction() {
        System.out.println("tv start state");
    }
}
