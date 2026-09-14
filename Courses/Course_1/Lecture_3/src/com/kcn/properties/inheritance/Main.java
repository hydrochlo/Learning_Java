package com.kcn.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        Box box1 = new Box(4);
        Box box2 = new Box(4.5, 3.9, 6.8);
        Box box3 = new Box(box2);

        System.out.println(box.l+" "+box.h+" "+box.w);
        System.out.println(box1.l+" "+box1.h+" "+box1.w);
        System.out.println(box2.l+" "+box2.h+" "+box2.w);
        System.out.println(box3.l+" "+box3.h+" "+box3.w);

        BoxWeight box4 = new BoxWeight();
        BoxWeight box5 = new BoxWeight(1, 2, 3, 4);
        System.out.println("l: "+box4.l+"  h: "+box4.h+"  w: "+box4.w+"  weight: "+box4.weight);
        System.out.println("l: "+box5.l+"|  h: "+box5.h+"|  w: "+box5.w+"|  weight: "+box5.weight);

        Box box6 = new BoxWeight(5,6,7,8);
        // It's actually the type of the reference variable that actually determines
        // (not the object) what members can be accessed..
        System.out.println("l: "+box6.l+"|  h: "+box6.h+"|  w: "+box6.w+"|  weight: ");

        /*There are many variables in both parent and child classes
        * you are given access to variables that are in the ref type i.e. BoxWeight
        * Hence, you should have access to weight variable
        * This also means, that the ones you are trying to access
        * should be initialized. But, here the object itself is of
        * type parent class, how will you call the constructor of child class.
        * that is why error.*/
        //BoxWeight box7 = new Box(10, 11, 12);
        //System.out.println("l: "+box7.l+"|  h: "+box7.h+"|  w: "+box7.w+"|  weight: "+box7.weight);

        BoxWeight box7 = new BoxWeight(box5);
        System.out.println("l: "+box7.l+" |  h: "+box7.h+" |  w: "+box7.w+" |  weight: "+box7.weight);
    }
}
