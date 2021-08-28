package com.design.patterns.creational.factory;

public class PlanFactory {

    public Plan getPlan(PlanType planType) {
        if (planType.equals(PlanType.COMMERCIAL)) {
            return new CommercialPlan();
        } else if (planType.equals(PlanType.DOMESTIC)) {
            return new DomesticPlan();
        } else if (planType.equals(PlanType.INSTITUTIONAL)) {
            return new InstitutionalPlan();
        }

        return null;
    }

}
