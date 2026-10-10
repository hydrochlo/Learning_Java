package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        /*
            1 2 3
            4 5 6
            7 8 9
        */

        // The first [] means the no. of rows. Which is mandatory.
        int[][] arr = new int[3][];

        int[][] arr2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] arr3 = {
                {1,2,3}, // 0th index
                {4,5},   // 1st index
                {6,7,8,9,10} // 2nd index
        };

        // Input
        int[][] arr4 = new int[3][2];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                arr4[i][j] = in.nextInt();
            }
        }

//        for (int i = 0; i < arr4.length; i++) {
//            for (int j = 0; j < arr4[i].length; j++) {
//                System.out.print(arr4[i][j] + " ");
//            }
//            System.out.print("\n");
//        }

        // Output
//        for (int i = 0; i < arr4.length; i++) {
//            System.out.println(Arrays.toString(arr4[i]));
//        }

        // Another output
        for(int[] a: arr4){
            System.out.println(Arrays.toString(a));
        }

    }

}
