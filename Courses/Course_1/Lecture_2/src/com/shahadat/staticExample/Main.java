package com.shahadat.staticExample;

public class Main {
    public static void main(String[] args) {

        // When a member is declared static it can be accessed before
        // any of the object of the class has been created and
        // without referencing to that object.
        System.out.println(Human.population);

        Human mati = new Human(20, "Mirazul Islam Mati", 10000, false);
        Human fahim = new Human(21, "Fahim Muntassir", 20000, false);

        System.out.println(mati.name);
        System.out.println(Human.population);
        System.out.println(Human.population);

        //greeting(); // Inside a static method you cannot use anything that is not static
    }

    static void fun(){
        // greeting();
        // Without specifying which instance this(`greeting()`) belongs to
        // I cannot use it over here.

        // but we can do this in the way below:
        // you cannot access not static stuff referencing
        // their instances in a static context.
        // Hence, here I am referencing it.
        Main obj = new Main();
        obj.greeting();

    }

    void fun2(){
        greeting();
    }

    // We know, that something which is not static, belongs to an object.
    void greeting(){
        System.out.println("Hello World!");
    }
}
