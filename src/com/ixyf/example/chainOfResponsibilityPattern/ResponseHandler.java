package com.ixyf.example.chainOfResponsibilityPattern;

public class ResponseHandler extends AbstractHandler implements Handler{
    private String name;

    public ResponseHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println("message response...");
        if (getHandler() != null) { // 执行责任链的下一个流程
            getHandler().operator();
        }
    }
}
