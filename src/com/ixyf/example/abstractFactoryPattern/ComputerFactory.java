package com.ixyf.example.abstractFactoryPattern;

public class ComputerFactory extends AbstractFactory{
    @Override
    public Phone createPhone(String brand) {
        return null;
    }

    @Override
    public Computer createComputer(String brand) {
        if ("huawei".equals(brand)) {
            return new ComputerHuawei();
        } else if ("apple".equals(brand)) {
            return new ComputerApple();
        } else {
            return null;
        }
    }
}
