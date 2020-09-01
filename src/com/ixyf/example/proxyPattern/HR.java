package com.ixyf.example.proxyPattern;

public class HR implements Company {
    @Override
    public void findWorker(String title) {
        System.out.println("i need find a worker.title is :" + title);
    }
}
