package com.ixyf.example.adapterPatternInterface;

public class SourceSub1 extends AbstractAdapter{
    @Override
    public void editTextFile() {
        System.out.println("a text file editing");
    }
}
