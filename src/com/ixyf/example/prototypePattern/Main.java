package com.ixyf.example.prototypePattern;

/**
 * 原型模式
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 浅拷贝
        Computer computer = new Computer("8 core", "16g", "1tb");
        System.out.println("before simple clone:" + computer.toString());
        Computer computerClone = (Computer) computer.clone();
        System.out.println("after simple clone:" + computerClone.toString());

        // 深拷贝
        Disk disk = new Disk("apple", 40, 20);
        ComputerDetail computerDetail = new ComputerDetail("16 core", "64g", disk);
        System.out.println("before deep clone:" + computerDetail.toString());
        ComputerDetail computerDetailClone = (ComputerDetail) computerDetail.clone();
        System.out.println("after deep clone:" + computerDetailClone.toString());

    }
}
