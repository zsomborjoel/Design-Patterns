package com.design.patterns.behavioral.command;

public class CommandClient {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        MainDish pizza = new MainDish("Pizza");
        OrderMainDish orderPizza = new OrderMainDish(pizza);
        waiter.execute(orderPizza);

        CancelMainDish cancelPizza = new CancelMainDish(pizza);
        waiter.execute(cancelPizza);
    }

}
