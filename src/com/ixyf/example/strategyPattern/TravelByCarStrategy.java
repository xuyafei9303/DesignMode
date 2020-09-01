package com.ixyf.example.strategyPattern;

public class TravelByCarStrategy implements TravelStrategy{
    @Override
    public void travelMode() {
        System.out.println("travel by car");
    }
}
