package com.design.patterns.behavioral.observer;

public class ObserverClient {

    public static void main(String[] args) {
        Order order = new Order();
        order.addItem(new Item("Pizza", 6.99));
        order.makePayment(new Payment("CASH", 10.2));
        order.completeOrder();
    }

}
