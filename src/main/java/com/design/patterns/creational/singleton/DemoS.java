package com.design.patterns.creational.singleton;

public class DemoS {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton lazySingleton = Singleton.getLazySingleton();

        singleton.doSomething();
        lazySingleton.doSomething();
    }

}
