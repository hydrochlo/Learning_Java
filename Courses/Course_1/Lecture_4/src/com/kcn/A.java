package com.kcn;

public class A {
    private int num;
    public String name;
    protected int[] arr;

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
