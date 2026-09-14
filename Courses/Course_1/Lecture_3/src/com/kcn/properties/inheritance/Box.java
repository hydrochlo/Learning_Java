package com.kcn.properties.inheritance;

public class Box {
    // private double l; -> If we use private here, then this `l` cannot be inherited
    /*NOTE:: Although a sub-class includes members of the super-class,
    * it will not be able to access ones that are private.
    * But you can still initialize it using the `super` thing. As
    * your class is not initializing it, it being initialized by
    * it's own class where it is lying.
    * */


    double l;
    double h;
    double w;

    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // Cube
    Box(double side){
        // super(); -> Object Class
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information(){
        System.out.println("Running the box!");
    }
}

/* Types of Inheritance
* i. Single Inheritance: One class extends another class. Example: Box -> BoxWeight
* ii. Multilevel Inheritance: Example: Box -> BoxWeight -> BoxPrice
* */