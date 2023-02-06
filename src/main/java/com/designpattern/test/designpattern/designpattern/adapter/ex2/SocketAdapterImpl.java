package com.designpattern.test.designpattern.designpattern.adapter.ex2;

public class SocketAdapterImpl implements SocketAdapter{
    private final Socket socket = new Socket();
    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get60Volt() {
        var s =  socket.getVolt();
        return convert(s.getVolt(), 2);
    }

    @Override
    public Volt get30Volt() {
        var s = socket.getVolt();
        return convert(s.getVolt(), 4);
    }

    private Volt convert(int volt, int i){
        return new Volt(volt / i);
    }
}
