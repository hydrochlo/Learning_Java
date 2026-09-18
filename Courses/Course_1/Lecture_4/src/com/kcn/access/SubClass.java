package com.kcn.access;

public class SubClass extends A {

    public SubClass(int num, String Name, int rollNo){
        super(num, Name, rollNo);
    }

    public static void main(String[] args) {
        SubClass s = new SubClass(10, "Shahadat", 20);

        int x = s.rollNo; //
    }
}