package com.kcn.properties.polymorphism;

public class Numbers {
    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    double sum(double a, int b){
        return a+b;
    }

    // Order can be different.
    void sum(int a, String b){
        //
    }
    void sum(String b, int a){
        //
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        System.out.println(obj.sum(2,  3));
        System.out.println(obj.sum(1, 2, 3));
        // obj.sum(1, 2, 3, 4); -> It will not run.
        System.out.println(obj.sum(1.0, 5));
    }
}
