package com.shahadat.cloning;

import java.util.Arrays;

public class Main {
    static void main(String[] args) throws CloneNotSupportedException{
        Human shahadat = new Human(20, "Shahadat Hossain");
        Human twin = new Human(shahadat);

//        System.out.println(twin.age);
//        System.out.println(twin.name);

        Human twin2 = (Human) shahadat.clone();
        System.out.println(twin2.age + "  " + twin2.name);
        System.out.println(Arrays.toString(twin2.arr));

        twin2.arr[0] = 500;
        System.out.println(Arrays.toString(shahadat.arr));
        System.out.println(Arrays.toString(twin2.arr));
    }
}
