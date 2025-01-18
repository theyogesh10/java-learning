package com.company;

import java.util.Scanner;

public class Java_003_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input from the User");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Number 1: ");
//        int a = sc.nextInt();
//        float a = sc.nextFloat();
//        System.out.println("Enter Number 2: ");
//        int b = sc.nextInt();
//        float b = sc.nextFloat();
//        System.out.println();
//        int sum = a + b;
//        float sum = a + b;
//        System.out.println("The sum of these numbers is: ");
//        System.out.println(sum);
//
//        boolean bol1 = sc.hasNextInt();
//        System.out.println(bol1);
//
//        String str = sc.next();
        String str = sc.nextLine();
        System.out.println(str);
    }
}
