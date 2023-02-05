package com.designpattern.test.designpattern.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private List<String> objects = new ArrayList<>();

    public Storage() {
        objects.add("test1");
        objects.add("test2");
        objects.add("test3");
        objects.add("test4");
    }

    public com.designpattern.test.designpattern.designpattern.iterator.Iterator getIterator() {
        return new Iterator();
    }

    public void add(String str) {
        objects.add(str);
    }

    private class Iterator implements com.designpattern.test.designpattern.designpattern.iterator.Iterator {
        int position = objects.size() > 0 ? 0 : -1;

        @Override
        public boolean hasNext() {
            return position <= objects.size() - 1;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return objects.get(position++);
            }
            else return null;
        }
    }
}
