package com.design.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class AddPaymentTopic implements Topic {

    List<Observer> addPaymentObservers = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        addPaymentObservers.add(observer);
    }

    @Override
    public void notifyObservers(String str) {
        for (Observer o : addPaymentObservers) {
            o.update(str);
        }
    }
}
