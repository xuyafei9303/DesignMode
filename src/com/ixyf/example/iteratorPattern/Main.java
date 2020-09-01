package com.ixyf.example.iteratorPattern;

/**
 * 迭代器模式
 * 提供了顺序访问集合对象中的各种元素，而不需要暴露该对象内部结构的方法
 * 集合就是典型的迭代器模式
 * 迭代器模式将遍历集合中所有元素的操作封装成迭代器类，目的是在不暴露集合内部结构的情况下，对外统一提供访问集合内部数据的方法
 */
public class Main {
    public static void main(String[] args) {
        // 定义集合
        Collection collection = new ListCollection();
        // 添加元素
        collection.add("object1");
        // 遍历
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
