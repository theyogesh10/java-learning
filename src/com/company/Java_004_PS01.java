package com.company;

import java.util.Scanner;

public class Java_004_PS01 {
    public static void main(String[] args) {
        // Question 1
        /*
        int a = 10;
        int b = 20;
        int c = 30;
        int sum = a + b + c;
        System.out.println(sum);
         */

        // Question 2
        /*
        float subject1 = 76;
        float subject2 = 56;
        float subject3 = 67;
        float cgpa = (subject1 + subject2 + subject3)/30;
        System.out.println(cgpa);
         */

        // Question 3
        /*
        System.out.println("What is your name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name + " have a good day!");
         */


        // Question 4
        /*
        double km = 5;
        double miles = km * 0.6213711922;
        System.out.println(miles);
         */

        // Question 5
        System.out.println("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        boolean num = sc.hasNextInt();
        System.out.println(num);

    }
}
