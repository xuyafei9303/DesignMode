package com.ixyf.example.mediatorPattern;

public class ColleagueLandlord extends Colleague{
    @Override
    public boolean operation(String message) {
        System.out.println("landlord receive a message from mediator : " + message);
        return true;
    }
}
