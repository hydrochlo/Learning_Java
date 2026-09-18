package com.kcn.access2;

import com.kcn.access.A;

public class SubClass extends A {

    public SubClass(int num, String Name, int rollNo){
        super(num, Name, rollNo);
    }

    public static void main(String[] args) {
        // This is working
        SubClass s = new SubClass(10, "Shahadat", 20);
        int x = s.rollNo; //
        System.out.println(x);

        /* Base knows what parent is.
        * But parent does not know who is their child. */

        // But this is not working ->
        A p = new A(40, "Hossain", 50);
        //int y = p.rollNo;
        //System.out.println(y);
    }
}

class SubClass2 extends A {

    public SubClass2(int num, String Name, int rollNo){
        super(num, Name, rollNo);
    }

    public static void main(String[] args) {
        A q = new A(40, "Hossain", 50);
        //int n = q.rollNo;
    }
}

class SubSubClass extends SubClass{
    public SubSubClass(int num, String name, int roll){
        super(num, name, roll);
    }

    public static void main(String[] args) {
        SubSubClass obj = new SubSubClass(50, "Miraz", 60);
        int n = obj.rollNo;
        System.out.println(n);
    }
}