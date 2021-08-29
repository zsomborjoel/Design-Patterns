package com.design.patterns.creational.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Meal {

    List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public Double getCost() {
        return items.stream()
                .map(Item::price)
                .mapToDouble(p -> p)
                .sum();
    }

}
