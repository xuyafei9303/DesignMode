package com.ixyf.example.chainOfResponsibilityPattern;

/**
 * 责任链模式/职责链模式
 * 为了避免请求发送者与多个请求处理者耦合在一起，责任链模式让所有请求的处理者持有下一个对象的引用
 * 从而将请求串联成一条线，在有请求发生时，可将请求沿着这条链进行传递，直到遇到该对象的处理器
 * 角色：
 * handler接口：用于规定在责任链上具体要执行的方法
 * abstractHandler抽象类：持有handler实例并通过setHandler和getHandler将各个具体的业务handler串联成一个责任链，客户端上的请求在责任链上执行
 * 业务handler：用户根据具体的业务需求实现的业务逻辑
 *
 */
public class Main {
    public static void main(String[] args) {
        AuthHandler authHandler = new AuthHandler("auth");
        BusinessHandler businessHandler = new BusinessHandler("business");
        ResponseHandler responseHandler = new ResponseHandler("response");
        authHandler.setHandler(businessHandler);
        businessHandler.setHandler(responseHandler);
        authHandler.operator();
    }
}
