package com.shahadat.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son s = new Son(25);
        s.career();
        s.normal();

        Daughter d = new Daughter(22);
        d.career();

        Parent.hello();

        //
        Parent d2 = new Daughter(21);

    }
}

/*

Can you create object of an abstract class?
-> No, you cannot create object of an abstract class.


*/