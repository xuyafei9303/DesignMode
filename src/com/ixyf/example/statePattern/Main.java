package com.ixyf.example.statePattern;

/**
 * 状态模式：对象行为型模式
 * 给对象定义不同的状态，并为不同的状态定义不同的行为，在状态发生改变时自动切换状态的行为
 * 角色：
 * 环境（context）：也叫上下文，用于维护对象当前的状态，并在对象状态发生变化时触发对象行为的变化
 * 抽象状态（abstractState）：定义了一个接口，用于定义对象中不同状态所对应的行为
 * 具体状态（concrete state）：实现抽象状态所定义的行为
 */
public class Main {
    public static void main(String[] args) {
        // 定义当前状态为工作状态
        Context context = new Context(new WorkState());
        context.action();
        // 切换为休假状态
        context.setState(new HolidayState());
        context.action();
    }
}
