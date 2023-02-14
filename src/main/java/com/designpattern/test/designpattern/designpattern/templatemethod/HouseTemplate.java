package com.designpattern.test.designpattern.designpattern.templatemethod;

public abstract class HouseTemplate {
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindow();
    }

    protected abstract void buildWalls();

    private void buildWindow() {
        System.out.println("buildWindows");
    }

    private void buildPillars() {
        System.out.println("buildPillars");
    }

    private void buildFoundation() {
        System.out.println("build Foundation");
    }
}
