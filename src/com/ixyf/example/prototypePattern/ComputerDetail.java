package com.ixyf.example.prototypePattern;

/**
 * 深拷贝/深复制
 * 在深复制的过程中，不论是基本数据类型还是引用数据类型，都会被重新复制和创建
 */
public class ComputerDetail implements Cloneable {
    private String cpu;
    private String memory;
    private Disk disk;

    public ComputerDetail(String cpu, String memory, Disk disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            ComputerDetail computerDetail = (ComputerDetail) super.clone();
            computerDetail.disk = (Disk) this.disk.clone();
            return computerDetail;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    @Override
    public String toString() {
        return "ComputerDetail{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", disk=" + disk +
                '}';
    }
}
