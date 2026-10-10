package com.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListP2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        System.out.println(list.toString());
    }
}

/*
    1. Size if fixed internally.
    2. Say arraylist fills by some amount
    -> It will create a new arraylist of say, double the size.
    -> Old elements are copied in new one.
    -> old one is deleted.jj
*/
