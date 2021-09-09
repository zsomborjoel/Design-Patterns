package com.design.patterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class Order {

    List<Item> cart = new ArrayList<>();
    List<PaymentStrategy> payments = new ArrayList<>();

    public void addItem(Item item) {
        cart.add(item);
        System.out.println("Item name: " + item.getName() + ", item price: " + item.getPrice());
    }

    public void makePayment(PaymentStrategy pm) {
        payments.add(pm);
        pm.pay();
    }

}
