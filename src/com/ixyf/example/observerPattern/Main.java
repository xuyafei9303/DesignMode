package com.ixyf.example.observerPattern;

/**
 * 观察者模式：对象行为型模式
 * 角色：
 * 抽象主题（subject）：持有订阅了该主题的观察者对象集合，同时提供增加删除观察者的方法和主题变化以后的通知方法
 * 具体主题（concrete subject）：实现了抽象主题的方法，在主题的内部状态发生改变时，调用该方法通知订阅了主题状态的观察者对象
 * 抽象观察者（observer）：观察者的抽象类或接口，定义了主体状态发生变化时需调用的方法
 * 具体观察者（concrete observer）：抽象观察者的实现类，在收到主题状态发生变化的信息后执行具体的触发机制
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.add(observer);
        subject.notifyObserver("data1");

    }
}
