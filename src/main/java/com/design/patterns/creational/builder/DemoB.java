package com.design.patterns.creational.builder;

public class DemoB {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.buildTwoCoke();
        System.out.println(meal.getCost());
    }

}
