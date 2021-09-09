package com.design.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class AddItemTopic implements Topic {

    List<Observer> addItemObservers = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        addItemObservers.add(observer);
    }

    @Override
    public void notifyObservers(String str) {
        for (Observer o : addItemObservers) {
            o.update(str);
        }
    }
}
