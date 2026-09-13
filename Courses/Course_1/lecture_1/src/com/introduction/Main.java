package com.introduction;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // Declaring + Initializing
//        Student[] ratul = new Student[5];
//        System.out.println(Arrays.toString(ratul));

        Student miraz = new Student(260242, "Mirazul Islam Mati", 3.69f);

//        miraz.name = "Mirazul Islam";
//        miraz.rollNo = 260242;
//        miraz.marks = 3.69f;

        System.out.println(miraz);
        System.out.println(miraz.rollNo);
        System.out.println(miraz.name);

    }
}

// Create a class
//class Student{
//    int rollNo;
//    String name;
//    float marks;
//}

class Student{
    int rollNo;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String name){
        this.name = name;
    }

    Student(int rollNo, String name, float marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}