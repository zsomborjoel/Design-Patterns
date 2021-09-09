package com.design.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class CompleteOrderTopic implements Topic {

    List<Observer> completeOrderObservers = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        completeOrderObservers.add(observer);
    }

    @Override
    public void notifyObservers(String str) {
        for (Observer o : completeOrderObservers) {
            o.update(str);
        }
    }
}
