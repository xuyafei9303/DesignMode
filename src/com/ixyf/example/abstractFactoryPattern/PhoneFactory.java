package com.ixyf.example.abstractFactoryPattern;

public class PhoneFactory extends AbstractFactory{
    @Override
    public Phone createPhone(String brand) {
        if ("huawei".equals(brand)) {
            return new PhoneHuawei();
        } else if ("apple".equals(brand)) {
            return new PhoneApple();
        } else {
            return null;
        }
    }

    @Override
    public Computer createComputer(String brand) {
        return null;
    }
}
