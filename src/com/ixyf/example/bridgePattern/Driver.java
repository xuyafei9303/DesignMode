package com.ixyf.example.bridgePattern;

public interface Driver {
    /**
     * 执行不同sql语句，面向不同数据库
     */
    void executeSQL();
}
