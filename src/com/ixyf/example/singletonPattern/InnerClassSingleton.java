package com.ixyf.example.singletonPattern;

/**
 * 静态内部类
 */
public class InnerClassSingleton {
    private static class SingletonHolder {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    public InnerClassSingleton() {
    }
    public static InnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
