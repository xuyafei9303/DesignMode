package com.ixyf.example.iteratorPattern;

public interface Iterator {
    // 指针前移
    public Object previous();
    // 指针后移
    public Object next();
    public boolean hasNext();

}
