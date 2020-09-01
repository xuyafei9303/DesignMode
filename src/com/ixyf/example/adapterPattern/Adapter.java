package com.ixyf.example.adapterPattern;

public class Adapter implements Targetable {

    Source source;

    public Adapter(Source source) {
        this.source = source;
    }

    @Override
    public void editWordFile() {
        System.out.println("编辑word file");
    }

    @Override
    public void editTxetFile() {
        source.editTextile();
    }
}
