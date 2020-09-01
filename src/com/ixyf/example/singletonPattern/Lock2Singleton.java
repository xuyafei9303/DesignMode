package com.ixyf.example.singletonPattern;

/**
 * 双重校验锁模式
 */
public class Lock2Singleton {
    private volatile static Lock2Singleton singleton;

    public Lock2Singleton() {
    }
    public static Lock2Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Lock2Singleton.class) {
                if (singleton == null) {
                    singleton = new Lock2Singleton();
                }
            }
        }
        return singleton;
    }
}
