package com.ixyf.example.adapterPatternInterface;

/**
 * 接口适配器模式
 */
public class Main {

    public static void main(String[] args) {
        Sourceable sourceable1 = new SourceSub1();
        Sourceable sourceable2 = new SourceSub2();
        sourceable1.editTextFile();
        sourceable2.editWordFile();
    }
}
