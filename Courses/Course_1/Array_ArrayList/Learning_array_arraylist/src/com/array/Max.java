package com.array;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 15};
        System.out.println(max(arr));

    }

    static int maxRange(int[] ar, int start, int end){
        int mx = ar[start];
        for (int i = start; i <= end; i++) {
            if(ar[i]>mx) {
                mx = ar[i];
            }
        }

        return mx;
    }

    static int max(int[] ar){
        int mx = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if(ar[i]>mx) {
                mx = ar[i];
            }
        }

        return mx;
    }
}
