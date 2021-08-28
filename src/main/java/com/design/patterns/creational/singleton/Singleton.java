package com.design.patterns.creational.singleton;

// Saves memory because object is not created at each request. Only single instance is reused again and again.
// Singleton pattern is mostly used in multi-threaded and database applications. It is used in logging, caching, thread pools, configuration settings etc.
public class Singleton {

    private static Singleton singleton = new Singleton();

    private static Singleton lazySingleton;

    private Singleton() {}

    public static Singleton getSingleton() {
        return singleton;
    }

    public static Singleton getLazySingleton() {
        if (lazySingleton == null) {
            synchronized (Singleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new Singleton();
                }
            }
        }

        return lazySingleton;
    }

    public void doSomething() {
        System.out.println("Hello from singleton");
    }

}
