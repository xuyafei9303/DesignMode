package com.ixyf.example.decoratorPattern;

/**
 * 装饰者模式
 * 在不改变原有类以及类的继承关系的情况下，动态扩展一个类的功能
 * source是被装饰者
 * Decorator是装饰者
 * 通过装饰者可以为被装饰者添加额外的功能
 */
public class Main {

    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable sourceable = new Decorator(source);
        sourceable.createComputer();
    }
}
