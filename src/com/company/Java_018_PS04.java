package com.company;

import java.util.Scanner;

public class Java_018_PS04 {
    public static void main(String[] args) {
        // Problem 1
        /*
        int a = 10;
        if (a = 11) {    //Error
            System.out.println("I am 11");
        }
        else {
            System.out.println("I am not 11");
        }
        */

        // Problem 2
        /*
        byte    s1, s2, s3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks in Physics");
        s1 = sc.nextByte();
        System.out.println("Enter your marks in Chemistry");
        s2 = sc.nextByte();
        System.out.println("Enter your marks in Mathematics");
        s3 = sc.nextByte();

        float avg = (s1+s2+s3)/3.0f;
        if (avg>=40 && s1>=33 && s2>=33 && s3>=33){
            System.out.println("Congratulations, You have been promoted!");
        }
        else {
            System.out.println("Sorry,  You have not been promoted! Please try again.");
        }
        */


        // Problem 3
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Total income in lacks: ");
        float tax = 0;
        float income = sc.nextFloat();
        if (income<=2.5){
            tax = tax + 0;
        }
        else if (income>2.5 && income <= 5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if (income>5f && income <= 10f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 2.5f);
        }
        else if (income>10f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("The Total tax paid by the Employee is: " + tax);

        */

        // Problem 4
        /*

        System.out.println("Enter Day Number (Ex. For Monday Enter 1) : ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter valid day number!");
        }
        */

        // Problem 5
        /*
        System.out.println("Enter Year (YYYY) : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year%4==0 && year%100!=0 || year%400==0){
            System.out.println("This is a Leap Year");
        }
        else {
            System.out.println("This is not a Leap Year");
        }
         */


        // Problem 6
        System.out.println("Enter a website URL : ");
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("This is an Organizational Website");
        }
        else if (website.endsWith(".com")){
            System.out.println("This is an Commercial Website");
        }
        else if (website.endsWith(".in")){
            System.out.println("This is an Indian Website");
        }
        else {
            System.out.println("Error!");
        }

    }
}
