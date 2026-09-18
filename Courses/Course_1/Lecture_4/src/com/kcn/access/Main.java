package com.kcn.access;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        A obj = new A(34, "Me", 46);

        // Need to do a few things.
        /* 1. Access the data members.
        *  2. Modify the data members.
        *  3.
        * */

        ArrayList<Integer> list = new ArrayList<>();
        //list.DEFAULT_CAPACITY; -> Cannot access private data

//        obj.setRollNo(20);
        int x = obj.rollNo; // I can access protected attributes form the same package;
    }
}

/* Notes:
* Built-in classes in Java:
*  i. lang
*  ii. io
*  iii. util
*  iv. applet
*  v. awt
*  vi. net
* */
