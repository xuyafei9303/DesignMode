package com.ixyf.example.visitorPattern;

import java.util.Date;

public class CEOVisitor implements Visitor{
    @Override
    public void visitor(ProjectElement element) {
        System.out.println("CEO visitor element");
        element.signature("CEO", new Date());
        System.out.println(element.toString());
    }
}
