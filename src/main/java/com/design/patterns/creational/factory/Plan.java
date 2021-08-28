package com.design.patterns.creational.factory;

abstract class Plan {

    protected double rate;
    abstract void getRate();

    public double calculateBill(int units) {
        return units * rate;
    }

}
