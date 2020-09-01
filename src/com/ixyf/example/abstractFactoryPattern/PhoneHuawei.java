package com.ixyf.example.abstractFactoryPattern;

public class PhoneHuawei implements Phone{
    @Override
    public String call() {
        return "call somebody by huawei phone";
    }
}
