package com.design.patterns.structural.decorator;

import java.util.Arrays;

public class DecoratorClient {

    public static void main(String[] args) {
        Item[] order = {
                new DeepFried(new Pizza()),
                new DoubleCheese(new DeepFried(new Pizza())),
                new DoubleCheese(new DoubleCheese(new Spicy(new DeepFried(new Pizza()))))
        };

        Arrays.stream(order).forEach(Item::prepare);
    }

}
