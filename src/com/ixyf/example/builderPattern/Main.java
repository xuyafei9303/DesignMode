package com.ixyf.example.builderPattern;

/**
 * 建造者模式
 * 角色：
 * builder：创建一个复杂商品的抽象接口 --> ComputerBuilder
 * ConcreteBuilder: builder接口的实现类，用于定义复杂商品的装配流程 --> ComputerConcreteBuilder
 * Director: 构造一个使用builder接口的对象 --> ComputerDirector
 * product: 表示被构造的复杂对象 --> Computer
 *
 */
public class Main {

    public static void main(String[] args) {
        ComputerDirector computerDirector = new ComputerDirector();
        ComputerBuilder computerBuilder = new ComputerConcreteBuilder();
        Computer computer = computerDirector.constructComputer(computerBuilder);
        System.out.println(computer.getCpu());
        System.out.println(computer.getMemory());
        System.out.println(computer.getDisk());
    }
}
