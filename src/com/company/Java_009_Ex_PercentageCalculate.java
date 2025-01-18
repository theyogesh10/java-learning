package com.company;

import java.util.Scanner;

public class Java_009_Ex_PercentageCalculate {
    public static void main(String[] args) {

        // Write a program to calculate percentage of a given students in CBSE board exam. His marks from 5 subject must be taken as input from the keyboard. (Marks are out of 100)


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Hindi Marks : ");
        int hindi = sc.nextInt();
        System.out.println("Enter your English Marks : ");
        int english = sc.nextInt();
        System.out.println("Enter your Mathematics Marks : ");
        int mathematics = sc.nextInt();
        System.out.println("Enter your Physics Marks : ");
        int physics = sc.nextInt();
        System.out.println("Enter your Chemistry Marks : ");
        int chemistry = sc.nextInt();

        float percentage = ((hindi + english + mathematics + physics + chemistry)/500.0f)*100;

        System.out.println("Percentage : " + percentage);

    }
}
