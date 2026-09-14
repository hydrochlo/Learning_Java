package com.shahadat.staticExample;

// This is a demo to show initialization of static variables
public class StaticBlock {
    static int a = 4;
    static int b;

    static {
        System.out.println("I am inside a static block");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println("a: " + StaticBlock.a + " | " + "b: " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println("a: " + StaticBlock.a + " | " + "b: " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println("a: " + StaticBlock.a + " | " + "b: " + StaticBlock.b);

    }
}
