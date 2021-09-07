package com.design.patterns.behavioral.command;

public class CancelMainDish implements Command {

    private MainDish mainDish;

    public CancelMainDish(MainDish mainDish) {
        this.mainDish = mainDish;
    }

    @Override
    public void execute() {
        mainDish.cancel();
    }
}
