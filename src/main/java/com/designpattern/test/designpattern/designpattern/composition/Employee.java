package com.designpattern.test.designpattern.designpattern.composition;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {

    private List<Employee> children = new ArrayList<>();

    public void addChild(Employee employee) {
        children.add(employee);
    }


}
