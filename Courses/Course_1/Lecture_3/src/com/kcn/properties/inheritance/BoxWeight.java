package com.kcn.properties.inheritance;

public class BoxWeight extends Box {
    double weight;

    //@Override
    static void greeting(){
        System.out.println("Hey, I am in BoxWeight.");
    }

    public BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(BoxWeight obj){
        super(obj);
        this.weight = obj.weight;
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // What is this? -> Call the parent class constructor.
        // -> This is used to initialize values present in parent class.

        // System.out.println(super.weight);
        /*Think of something like: we have weight in BoxWeight class and
        * also we have weight in Box class. So if we write `this.weight` inside
        * BoxWeight class it will refer to the weight inside BoxWeight class
        * and if we do `super.weight` inside BoxWeight class it will refer to
        * the weight that is inside the Box class.
        * */

        this.weight = weight;
    }
}

/* Overriding Depends on Objects, Static does not depend on Object, So, Static methods cannot be overridden.
*
* */
