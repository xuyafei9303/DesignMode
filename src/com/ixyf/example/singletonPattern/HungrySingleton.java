package com.ixyf.example.singletonPattern;

/**
 * 饿汉式
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    public HungrySingleton() {
    }
    public static HungrySingleton getInstance() {
        return instance;
    }
}
