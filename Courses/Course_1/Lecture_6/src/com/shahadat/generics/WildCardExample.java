package com.shahadat.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Here T should either be number or its subclasses.
public class WildCardExample<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public WildCardExample() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<Number> list){
        // Do something

        // List<Number> : here you can pass only number type.
        // List<? extends Number> : here you can pass number or its subclasses.
    }

    public void add(T n){
        if(isFull()){
            resize();
        }
        data[size++] = n;

    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for(int i=0; i<data.length; i++){
            temp[i] = data[i];
        }

        data = temp;
    }

    public T remove(){
        T removed = (T)data[--size];
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int idx, T val){
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

        WildCardExample list = new WildCardExample();
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
