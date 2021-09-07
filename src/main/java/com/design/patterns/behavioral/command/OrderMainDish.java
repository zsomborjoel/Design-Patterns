package com.design.patterns.behavioral.command;

public class OrderMainDish implements Command {

    private MainDish mainDish;

    public OrderMainDish(MainDish mainDish) {
        this.mainDish = mainDish;
    }

    @Override
    public void execute() {
        mainDish.order();
    }
}
