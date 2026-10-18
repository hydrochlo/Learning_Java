package com.shahadat.abstractDemo;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }

    //    public Daughter(int age) {
//        this.age = age;
//    }

    @Override
    void career(){
        System.out.println("I am going to be a Painter.");
    }

    @Override
    void partner(){
        System.out.println("I love Beta.");
    }
}


/*
Interface Notes:
    * What are interfaces?
    -> Interfaces basically contain abstract functions.
    -> It is like a class only but not completely.
    -> Variables are static and final by default in interfaces.
    -> Interfaces mostly specify like what the class is doing,
       not how it's doing it.
    -> Members of the Java interface is public by default.
    -> A class can implement more than 1 interface.
    -> A class can only inherit a single super/abstract class.

    *
 */