package com.ixyf.example.observerPattern;

public class ConcreteSubject extends Subject{
    @Override
    public void notifyObserver(String message) {
        for (Object obs: observers) {
            System.out.println("notify observer : " + message + " change...");
            ((Observer)obs).dataChange(message);

        }

    }
}
