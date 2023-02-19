package com.designpattern.test.designpattern.designpattern.visitor;

public interface Visitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
