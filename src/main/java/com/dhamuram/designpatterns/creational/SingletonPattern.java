package com.dhamuram.designpatterns.creational;

public class SingletonPattern {

    // Initialise the object as private static
    private static SingletonPattern singletonPatternObject;

    // Make constructor private
    private SingletonPattern() {

    }

    // Static factory method
    // synchronized method will make thread-safe.
    synchronized public static SingletonPattern getInstance() {

        if (singletonPatternObject == null) {
            singletonPatternObject = new SingletonPattern();
        }

        return singletonPatternObject;
    }

    private void printHello(){
        System.out.println("Singleton Class !!!");
    }

    public static void main(String[] args) {

        SingletonPattern singletonPattern = SingletonPattern.getInstance();

        singletonPattern.printHello();
    }
}
