package com.designpattern.test.designpattern.designpattern.adapter.ex2;

public class Socket {
    private Volt volt;

    public Socket() {
        this.volt = new Volt(120);
    }

    public Volt getVolt() {
        return volt;
    }

    public void setVolt(Volt volt) {
        this.volt = volt;
    }
}
