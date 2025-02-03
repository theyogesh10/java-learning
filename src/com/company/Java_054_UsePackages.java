package com.company;

// import java.util.Scanner;        // Type 1 (How to use Packages)
// import java.util.*;              // Type 2

public class Java_054_UsePackages {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        java.util.Scanner sc = new java.util.Scanner(System.in);        // Type 3
        int a = sc.nextInt();
        System.out.println("This is my scanner taking input as "+ a);

    }
}
