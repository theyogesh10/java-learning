package com.company;

public class Java_024_Arrays {
    public static void main(String[] args) {
        // Arrays - There are three main ways to create an array in Java

        // 1. First Declaration and then Memory Allocation
        // int [] marks;
        // marks = new int[5];

        // 2. Declaration and Memory Allocation
        // int [] marks = new int[5];

        // Initialization
        // marks[0] = 100;
        // marks[1] = 87;
        // marks[2] = 98;
        // marks[3] = 76;
        // marks[4] = 80;
        // marks[5] = 96;  // throws of error, out of bounds for length


        // 3. Declaration, Memory Allocation and Initialization together
        int [] marks  = {98,87,95,97,76};

        System.out.println(marks[4]);

    }
}
