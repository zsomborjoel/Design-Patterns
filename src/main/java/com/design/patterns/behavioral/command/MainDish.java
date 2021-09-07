package com.design.patterns.behavioral.command;

public class MainDish implements Item {

    String name;

    public MainDish(String name) {
        this.name = name;
    }

    @Override
    public void order() {
        System.out.println(String.format("Main Dish %s is ordered.", name));
    }

    @Override
    public void cancel() {
        System.out.println(String.format("Main Dish %s is cancelled.", name));
    }
}
