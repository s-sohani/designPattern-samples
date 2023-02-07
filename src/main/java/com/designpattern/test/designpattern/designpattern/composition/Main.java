package com.designpattern.test.designpattern.designpattern.composition;

public class Main {
    public static void main(String[] args) {
        var manager = new Manager();
        var lead = new Lead();
        manager.addChild(lead);
        lead.addChild(new Developer());
        lead.addChild(new Developer());
    }
}
