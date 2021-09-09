package com.design.patterns.behavioral.observer;

public interface Topic {

    void register(Observer observer);
    void notifyObservers(String str);

}
