package com.ixyf.example.singletonPattern;

/**
 * 懒汉式
 */
public class LazySingleton {

    private static LazySingleton instance;
    public LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return null;
    }
}
