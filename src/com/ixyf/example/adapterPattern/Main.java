package com.ixyf.example.adapterPattern;

/**
 * 适配器模式
 * 三个角色：
 * source 待适配的类
 * targetable 目标接口
 * adapter 适配器
 */
public class Main {
    public static void main(String[] args) {
        Targetable target = new Adapter(new Source());
        target.editTxetFile();
        target.editWordFile();
    }
}
