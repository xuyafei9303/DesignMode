package com.ixyf.example.observerPattern;

public class ConcreteObserver implements Observer {
    @Override
    public void dataChange(String message) {
        System.out.println("receive message:" + message);
    }
}
