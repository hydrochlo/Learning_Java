package com.kcn.properties.polymorphism;

public class Shapes{
    void area(){
        System.out.println("I am inside shape.");
    }

    // Early Bindings
    final void area2(){
        System.out.println("I am inside shape.");
    }
}
