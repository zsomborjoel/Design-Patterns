package com.design.patterns.creational.builder;

public class MealBuilder {

    public Meal buildTwoCoke() {
        Meal meal = new Meal();
        meal.addItem(new Coke());
        meal.addItem(new Coke());

        return meal;
    }

}
