package com.shahadat.singleton;

public class Main {
    public static void main(String[] args) {
//        Singleton obj = new Singleton();
//        obj.num

        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();
        // All 3 reference variables are pointing to just one object.
    }
}
