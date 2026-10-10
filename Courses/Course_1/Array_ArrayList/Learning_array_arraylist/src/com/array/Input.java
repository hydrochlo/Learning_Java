package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//        arr[0] = 12;
//        arr[1] = 45;
//        arr[2] = 46;
//        arr[3] = 78;
//        arr[4] = 89;
//
//        System.out.println(arr[3]);
//        System.out.println(Arrays.toString(arr));

        // take input using for loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }

        // Normal for loop
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        // For-each loop
//        for (int num: arr){ // For every element in array, print the element.
//            System.out.print(num + " "); // Here num represents element of the array.
//        }


        // Array of objects
        String[] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "Shahadat";
        System.out.println(Arrays.toString(str));
    }
}
