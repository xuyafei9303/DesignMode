package com.ixyf.example.iteratorPattern;

public class ConcreteIterator implements Iterator{
    private final Collection collection;
    private int pos = -1; // 当前迭代器遍历到的元素位置

    public ConcreteIterator(Collection collection) {
        this.collection = collection;
    }

    @Override
    public Object previous() {
        if (pos > 0) pos--;
        return collection.get(pos);
    }

    @Override
    public Object next() {
        if (pos < collection.size() - 1) pos++;
        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        return pos < collection.size() - 1;
    }
}
