package com.ixyf.example.proxyPattern;

/**
 * 代理模式
 * 角色：
 * 被代理对象 hr
 * 代理 proxy
 */
public class Main {

    public static void main(String[] args) {
        Company company = new Proxy();
        company.findWorker("java");
    }
}
