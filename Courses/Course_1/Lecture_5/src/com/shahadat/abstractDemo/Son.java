package com.shahadat.abstractDemo;

public class Son extends Parent{
    public Son(int age) {
        super(age);
    }

    //    public Son(int age) {
//        this.age = age;
//    }


    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career(){
        System.out.println("I am going to be a Programmer.");
    }

    @Override
    void partner(){
        System.out.println("I love Alpha.");
    }
}
