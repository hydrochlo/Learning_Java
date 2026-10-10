package com.array;

public class Main {
    public static void main(String[] args) {
        // Syntax
        // DataType[] variableName = new DataType[size]
        int[] rollNos = new int[5];

        // Or directly
        int[] rollNos2 = {23, 12, 45, 32, 15};


        int[] rollNos3; // Declaration of array. Here rollNos3 is getting defined in the stack.
        rollNos3 = new int[5]; // Actually here object is being created in the heap memory.

        System.out.println(rollNos3[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);
    }
}

// Notes:
/* 1. Array objects are in heap.
*  2. Heap objects are not continuous
*  3. Dynamic memory allocation
*  4.
* */