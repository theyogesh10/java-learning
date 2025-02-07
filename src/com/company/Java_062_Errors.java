package com.company;

import java.util.Scanner;

public class Java_062_Errors {
    public static void main(String[] args) {
        /*
        // SYNTAX ERROR DEMO
        int a = 5   // error : no semicolon
        int b = 9;
        c = 0;      // c not declared
        System.out.println(a+b);
         */

        /*
        // LOGICAL ERROR DEMO
        // Prime number (this is not a prime number logic, this is odd number logic)
        System.out.println(2);
        for(int i=1; i<5; i++){
            System.out.println(2*i+1);
        }
         */

        // RUNTIME ERROR DEMO
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is " + 1000/k);
    }
}
