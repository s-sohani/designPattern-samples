package com.designpattern.test.designpattern.designpattern.visitor;

public class Fruit implements ItemElement{
    private String fruitName;
    private int price;

    public Fruit(String fruitName, int price) {
        this.fruitName = fruitName;
        this.price = price;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
