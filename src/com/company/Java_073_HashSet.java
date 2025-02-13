package com.company;

import java.util.HashSet;

public class Java_073_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>();
        HashSet<Integer> myHashSet2 = new HashSet<>(65,0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11);
        System.out.println(myHashSet);


    }
}
