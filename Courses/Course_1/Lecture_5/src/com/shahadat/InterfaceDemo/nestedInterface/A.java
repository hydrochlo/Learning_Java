package com.shahadat.InterfaceDemo.nestedInterface;

public class A {
    // Nested Interface
    public interface NestedInterface{
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface{
    @Override
    public boolean isOdd(int num) {
        return (num&1) == 1;
    }
}
/*
The nested interface can be declared as like public, private or protected
but the top level interface has to be declared as public or the default one..
 */
