package com.kcn.properties.polymorphism;

public class Circle extends Shapes{

    // This will run when object of Circle is created.
    // Hence, it is overriding the parent method.
    @Override // This is called annotation.
    void area(){
        System.out.println("Area is pi * r * r");
    }
}
