package com.ixyf.example.strategyPattern;

/**
 * 策略模式
 * 为同一个行为定义不同的策略并提供实现，系统根据不同的策略自动切换不同的方法来实现策略的改变
 * 大量的额if...else可以使用策略模型进行实现
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        TravelStrategy travelByAirStrategy = new TravelByAirStrategy();
        // 设置出行策略为飞机
        context.setTravelStrategy(travelByAirStrategy);
        context.travelMode();
        System.out.println("change travelStrategy to travelByCarStrategy...");

        // 设置出行策略为开车
        TravelStrategy travelByCarStrategy = new TravelByCarStrategy();
        context.setTravelStrategy(travelByCarStrategy);
        context.travelMode();

    }
}
