package com.ixyf.example.bridgePattern;

public class MysqlDriver implements Driver{
    @Override
    public void executeSQL() {
        System.out.println("execute sql by mysql driver");
    }
}
