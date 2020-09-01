package com.ixyf.example.factoryPattern;

/**
 * 工厂模式
 */
public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();
        Phone huawei = factory.createPhone("huawei");
        Phone iphone = factory.createPhone("apple");
        System.out.println(huawei.brand());
        System.out.println(iphone.brand());
    }
}
