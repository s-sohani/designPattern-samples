package com.designpattern.test.designpattern.designpattern.iterator;

public class Main {
    public static void main(String[] args) {
        var st = new Storage();
        var it = st.getIterator();
        st.add("test5");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
