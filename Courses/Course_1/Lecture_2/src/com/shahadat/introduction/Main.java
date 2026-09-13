package com.shahadat.introduction;

public class Main {
    public static void main(String[] args){
        A obj = new A("Shahadat");
        System.out.println(obj);
    }
}

class A{
    String name;

    public A(String name) {
        this.name = name;
    }


}