package com.shahadat.InterfaceDemo.extendDemo2;

public interface A {

    // Static interface methods should always have a body.
    static void greeting(){
        System.out.println("Hey I'm static method.");
    }

    default void fun() {
        System.out.println("I am in A");
    }
}
/*
Static methods will not get inherited
 */