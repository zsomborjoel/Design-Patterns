package com.design.patterns.behavioral.strategy;

public class StrategyClient {

    public static void main(String[] args) {
        Order order = new Order();
        order.addItem(new Item("Pizza", 9.60));
        order.makePayment(new CashPayment(10.00));
    }

}
