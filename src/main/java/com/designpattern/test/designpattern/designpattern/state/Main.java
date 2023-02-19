package com.designpattern.test.designpattern.designpattern.state;

public class Main {
    public static void main(String[] args) {
        var tv = new TvContext();
        tv.setState(new TvStartState());
        tv.doAction();

        tv.setState(new TvStopState());
        tv.doAction();
    }
}
