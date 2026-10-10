package com.arraylist;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(66);
        list.add(67);
        list.add(68);
        list.add(69);
        list.add(70);
        list.add(71);

        System.out.println(list.contains(69));

        System.out.println(list);
        System.out.println(list.size());

        list.set(0, 56);
        System.out.println(list);


    }
}
