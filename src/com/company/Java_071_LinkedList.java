package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Java_071_LinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(45);
        l2.add(42);
        l2.add(48);

        l1.add(6);
        l1.add(7);
        l1.add(5);
        l1.add(6);
        l1.add(0,9);
        l1.add(0,1);
        l1.addLast(893);
        l1.addFirst(954);

        // l1.addAll(l2);
        // l1.addAll(0,l2);
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
