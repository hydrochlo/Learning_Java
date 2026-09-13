package com.introduction;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10, b = 20;
        Integer c = 50;
        Integer d = 100;
//        System.out.println(b.byteValue());
        swap(a, b);
        swap2(c, d);
        System.out.println(a + " " + b);
        System.out.println(c + " " + d);

        final int bonus = 2;
        // bonus = 3;
        // You cannot change the value of a variable named with final

        final A shahadat = new A("Shahadat Hossain");
        shahadat.name = "Hossain Shahadat";

        // When a non-primitive is 'final' you cannot reassign it.
        // shahadat = new A("Anamul Haque"); // I can't do this. This will cause error.

        A obj;
        for(int i=0; i<1000000000; i++){
            obj = new A("Random Name");
        }
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap2(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A{
    final int a = 10;
    String name;

    public A(String name) {
        System.out.println("Object is being created!\n");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is Destroyed!!\n");
    }
}