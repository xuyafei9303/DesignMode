package com.ixyf.example.iteratorPattern;

public interface Collection {
    // 对集合元素的迭代
    public Iterator iterator();
    // 取得集合元素
    public Object get(int i);
    // 向集合添加元素
    public boolean add(Object object);
    // 取得集合大小
    public int size();
}
