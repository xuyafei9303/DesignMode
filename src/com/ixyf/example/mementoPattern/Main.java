package com.ixyf.example.mementoPattern;

/**
 * 备忘录模式/快照模式
 * 该模式将当前对象的内部状态保存到备忘录中，以便在需要时能将该对象的状态恢复到原先保存的状态
 * 角色：
 * 发起人（originator）： 记录当前时刻对象的内部状态，定义创建备忘录和恢复备忘录数据的方法
 * 备忘录（memento）：负责存储对象的内部状态
 * 状态管理者（storage）：对备忘录的历史状态进行存储，定义了保存和获取备忘录状态的功能，注意：备忘录只能被保存或恢复，不能进行修改
 */
public class Main {
    public static void main(String[] args) {
        // 创建原始类
        Original original = new Original("张三");
        // 创建备忘录
        Storage storage = new Storage(original.createMemento());
        // 修改原始类的状态
        System.out.println("original value: " + original.getValue());
        original.setValue("李四");
        System.out.println("update value: " + original.getValue());

        // 恢复原始类的状态
        original.restoreMemento(storage.getMemento());
        System.out.println("restore value: " + original.getValue());
    }
}
