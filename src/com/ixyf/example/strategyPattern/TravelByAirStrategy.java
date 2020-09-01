package com.ixyf.example.strategyPattern;

public class TravelByAirStrategy implements TravelStrategy {

    @Override
    public void travelMode() {
        System.out.println("travel by air");
    }
}
