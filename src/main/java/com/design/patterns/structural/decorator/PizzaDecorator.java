package com.design.patterns.structural.decorator;

public class PizzaDecorator implements Item {

    Item item;

    public PizzaDecorator(Item item) {
        this.item = item;
    }


    @Override
    public void prepare() {
        item.prepare();
    }

}
