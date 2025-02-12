package com.company;

import java.util.ArrayDeque;

public class Java_072_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(34);
        ad1.add(9);
        ad1.addFirst(5);

        ad1.remove();
        ad1.removeLast();

        System.out.println(ad1);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
