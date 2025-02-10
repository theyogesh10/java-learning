package com.company;

import java.util.*;

public class Java_070_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(45);
        l2.add(42);
        l2.add(48);

        l1.add(6);
        l1.add(7);
        l1.add(5);
        l1.add(6);
        l1.add(0,9);
        l1.add(0,1);

        // l1.addAll(l2);
         l1.addAll(0,l2);
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));

        l1.set(1,99);

        // l1.clear();

        for (int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

    }
}
