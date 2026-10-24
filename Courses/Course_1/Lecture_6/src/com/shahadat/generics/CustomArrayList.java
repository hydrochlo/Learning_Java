package com.shahadat.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList{

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int n){
        if(isFull()){
            resize();
        }
        data[size++] = n;

    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        // copy the current items in the new array
        for(int i=0; i<data.length; i++){
            temp[i] = data[i];
        }

        data = temp;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int idx, int val){
        data[idx] = val;
    }

    private boolean isFull(){
        return size == data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(45);

        CustomArrayList list = new CustomArrayList();
//        list.add(10);
//        list.add(20);
//        list.add(30);

        for(int i=0; i<15; i++){
            list.add(2*i + 1);
        }

        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add()
    }
}
