package com.ixyf.example.chainOfResponsibilityPattern;

public class BusinessHandler extends AbstractHandler implements Handler{
    private String name;

    public BusinessHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println("business info handler...");
        if (getHandler() != null) { // 执行责任链的下一个流程
            getHandler().operator();
        }
    }
}
