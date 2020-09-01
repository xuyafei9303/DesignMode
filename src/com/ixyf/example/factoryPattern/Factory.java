package com.ixyf.example.factoryPattern;

public class Factory {

    public Phone createPhone(String phoneName) {
        if ("huawei".equals(phoneName)) {
            return new Huawei();
        } else if ("apple".equals(phoneName)) {
            return new Iphone();
        } else {
            return null;
        }
    }
}
