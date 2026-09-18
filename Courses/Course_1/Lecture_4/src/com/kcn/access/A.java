package com.kcn.access;

public class A {
    private int num;
    public String name;
    protected int[] arr;
    protected int rollNo;

    public A(int num, String name, int roll) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
        this.rollNo = roll;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
