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
    }
}
