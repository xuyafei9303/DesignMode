package com.ixyf.example.flyweightPattern;

/**
 * 结构性模式
 * 通过对象的复用来减少对象的创建次数和数量
 * 主要用于避免在有大量的对象频繁创建和销毁对象时造成系统资源的浪费
 * 比如下面内存申请的例子 先创建内存管理工厂，有可用内存块的时候直接获取，没有则创建
 */
public class Main {
    public static void main(String[] args) {
        // 首次获取内存，将创建一个内存
        Memory memory = MemoryFactory.getMemory(32);
        // 使用后释放内存
        MemoryFactory.releaseMemory(memory.getId());
        // 重新获取内存
        MemoryFactory.getMemory(32);
    }
}
