package com.shahadat.abstractDemo;

public abstract class Parent {

    int age;
    final int value;

    public Parent(int age) {
        this.age = age;
        value = 100;
    }

    static void hello(){
        System.out.println("Hey!!");
    }

    void normal(){
        System.out.println("This is a normal method.");
    }

    abstract void career();
    abstract void partner();
}

/*
a. Can you create abstract constructors?
-> No, you cannot.

b. Why you can't create object of abstract class?
-> If you were able to create an object of the parent class,
   and then you try to call the abstract method then you
   will get error because they have nothing inside them.
   That's why creating objects of abstract class is
   not possible.

c. Can you create abstract static methods?
-> No, you cannot.

d. Can you create normal methods inside an abstract class?
-> Yes, you can. But that has no use..

e. Is final abstract class possible?
-> If I put final before a class, if prevents it from being inherited.
   We make a class abstract when we know it will be inherited or
   it has to  be inherited.


 */
