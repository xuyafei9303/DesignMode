package com.ixyf.example.visitorPattern;

import java.util.Date;

/**
 * 访问者模式
 * 角色：
 * 抽象访问者（visitor）：定义了一个访问元素的接口，为每类元素都定义了一个访问操作visitor，该操作中的参数类型对应被访问元素的数据类型
 * 具体访问类（concrete visitor）：抽象访问类的实现者，实现了不同访问者访问到元素后的具体行为
 * 抽象元素（element）：元素的抽象表示，定义了访问该元素的入口的accept方法，不同的访问者类型代表不同的访问者
 * 具体元素（concrete element）：实现具体元素定义的accept操作，并根据访问者的不同类型实现不同的具体逻辑
 */
public class CTOVisitor implements Visitor{
    @Override
    public void visitor(ProjectElement element) {
        System.out.println("CTO visitor element");
        element.signature("CTO", new Date());
        System.out.println(element.toString());
    }
}
