package com.shahadat.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    /*Notes:
    * In Java, `public` defines access permission (who can see it),
    * while `static` defines
    * ownership (it belongs to the Class itself,
    * not an individual object created with new).
    * */

    static void message(){
        System.out.println("Hello, I'm Me!");
        //System.out.println(this.age); // You cannot do this. Because age is dependent on object.
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }


}

/*
* static: Allows the JVM to call
* `Main.main()` directly without
* instantiating (`new Main()`) your class first.
* If main were not static, Java would
* be stuck in a dilemma: it couldn't
* create an instance of Main because
* it hasn't run any code yet to know how.*/