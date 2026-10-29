package collections;

import java.util.*;

public class Main {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(34);
        list2.add(78);
        list2.add(55);
        list2.add(59);

        System.out.println(list2);

        List<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        System.out.println(vector);
    }
}
