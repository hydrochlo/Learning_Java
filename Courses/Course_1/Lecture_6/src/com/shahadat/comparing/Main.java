package com.shahadat.comparing;

import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        Student shahadat = new Student(46, 88.5f);
        Student mouri = new Student(89, 99.5f);
        Student mahin = new Student(10, 96.0f);
        Student liton = new Student(13, 94.5f);
        Student miraz = new Student(45, 68.5f);
        Student mati = new Student(64, 66.0f);

        Student[] list = {shahadat, mouri, mahin, liton, miraz, mati};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

//        if(shahadat.compareTo(mouri)<0) {
//            System.out.println("Mouri got more marks.");
//        }
    }
}
