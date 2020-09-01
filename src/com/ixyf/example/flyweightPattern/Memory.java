package com.ixyf.example.flyweightPattern;

public class Memory {
    private int size; // 内存大小MB
    private boolean isUsed; // 内存是否被使用
    private String id; // 内存id

    public Memory(int size, boolean isUsed, String id) {
        this.size = size;
        this.isUsed = isUsed;
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
