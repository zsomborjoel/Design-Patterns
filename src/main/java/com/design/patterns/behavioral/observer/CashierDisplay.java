package com.design.patterns.behavioral.observer;

public class CashierDisplay extends Observer {
    @Override
    public void update(String str) {
        System.out.println("CashierDisplay: ".concat(str));
    }
}
