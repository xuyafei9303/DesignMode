package com.ixyf.example.commandPattern;

/**
 * 命令模式
 * 将请求封装为命令基于事件驱动异步的执行，以实现命令的发送者和执行者之间的解耦
 * 角色：
 * 抽象命令类（command）：执行命令的接口，定义执行命令的抽象方法execute（）
 * 具体命令类（concrete command）：抽象命令类的实现类，持有接收者对象，并在接收到命令后调用命令执行者的方法action（）实现命令的调用和执行
 * 命令执行者（receiver）：命令的具体执行者，定义了命令执行的具体方法action
 */
public class Main {
    public static void main(String[] args) {
        // 定义命令的接受和执行者
        Receiver receiver = new Receiver();
        // 定义命令实现类
        Command command = new ConcreteCommand(receiver);
        // 定义命令调用者
        Invoker invoker = new Invoker(command);
        // 命令调用
        invoker.action("command1");
    }
}
