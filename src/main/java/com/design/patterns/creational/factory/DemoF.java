package com.design.patterns.creational.factory;

public class DemoF {

    public static void main(String[] args) {
        PlanFactory planFactory = new PlanFactory();
        Plan planOne = planFactory.getPlan(PlanType.DOMESTIC);
        planOne.getRate();
        System.out.println(planOne.rate);
    }

}
