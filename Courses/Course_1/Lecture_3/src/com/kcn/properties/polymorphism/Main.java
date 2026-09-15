package com.kcn.properties.polymorphism;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes square2 = new Square();

        shapes.area();
        square2.area();

        Shapes circle2 = new Circle();
        circle2.area();
    }
}
/* NOTE:
* Types of Polymorphism
* i. Compile Time/ Static Polymorphism: Achieved via method overloading.
*       # method overloading -> Same name but type, arguments, return types,
*         ordering can be different. Example: Multiple Constructors.
*         A a1 = new A();
*         A a2 = new A(3, 4);
*
* ii. Run Time/ Dynamic Polymorphism: Achieved by method overriding.
* */




/* suppose,
* [ Parent obj = new Child();
* Here, which method will be called depends on -> Child(). This is known as
* Upcasting. ] -> This entire thing is known as Overriding
* Suppose,
* There is a function with the same name in the parent class and
* there is a function with the same name in the child class. We know that
* the child class one's will be run.
* -> The Object type defines which one to run.
* -> The reference type defines which one to access.
*
* But the Question is `HOW JAVA DETERMINES THIS?`
* -> By `Dynamic Method Dispatch`.(It is just a mechanism by which a call to an overridden method is resolved at runtime rather than compile time.)
* */