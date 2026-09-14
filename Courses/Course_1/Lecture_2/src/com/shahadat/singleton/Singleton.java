package com.shahadat.singleton;

public class Singleton {
//    private int x = 0;
    private Singleton(){

    }

    private static Singleton instance;
    public static Singleton getInstance(){
        // Check whether one object is created or not
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
