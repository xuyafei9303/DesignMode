package com.ixyf.example.abstractFactoryPattern;

/**
 * 抽象工厂
 */
public class Main {

    public static void main(String[] args) {
        AbstractFactory phoneFactory = new PhoneFactory();
        Phone iphone = phoneFactory.createPhone("apple");
        Phone huawei = phoneFactory.createPhone("huawei");
        System.out.println(iphone.call());
        System.out.println(huawei.call());

        AbstractFactory computerFactory = new ComputerFactory();
        Computer mac = computerFactory.createComputer("apple");
        Computer huaweiMac = computerFactory.createComputer("huawei");
        System.out.println(mac.internet());
        System.out.println(huaweiMac.internet());
    }
}
