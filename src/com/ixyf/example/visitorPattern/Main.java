package com.ixyf.example.visitorPattern;

/**
 * 访问者模式
 * 将数据结构和对数据的操作分离开来，使其在不改变数据结构的前提下，动态添加作用于这些元素的操作
 * 角色：
 * 抽象访问者（visitor）：定义了一个访问元素的接口，为每类元素都定义了一个访问操作visit（），该操作中的参数类型对应被访问元素的数据类型
 * 具体访问类（concrete visitor）：抽象访问者的实现类，实现了不同的访问者访问到元素后具体的操作行为
 * 抽象元素（element）：元素的抽象表示，定义了访问该元素的的入口accept（）方法，不同的访问者类型代表不同的访问者
 * 具体元素（concrete element）：实现抽象元素定义的accept（）操作，并根据访问者的不同类型实现不同的操作逻辑
 */
public class Main {
    public static void main(String[] args) {
        Element element = new ProjectElement("mobike", "share bicycle");
        element.accept(new CTOVisitor());
        element.accept(new CTOVisitor());
    }
}
