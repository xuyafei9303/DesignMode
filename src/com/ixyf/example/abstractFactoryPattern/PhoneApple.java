package com.ixyf.example.abstractFactoryPattern;

public class PhoneApple implements Phone{
    @Override
    public String call() {
        return "call somebody by apple phone";
    }
}
