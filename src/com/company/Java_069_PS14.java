package com.company;

import java.util.Scanner;

public class Java_069_PS14 {
    public static void main(String[] args) {

        // Problem1
        // int a = 7      // Syntax Error
        // int a = 78;
        // int year_born = 2000-78;    // Logical Error
        // System.out.println(6/0);    // Exception

        // Problem 2
        /*
        try{
            int a = 666/0;
            System.out.println(a);
        }
        catch (IllegalArgumentException e){
            System.out.println("HeHe - IllegalArgumentException");
        }
        catch (ArithmeticException e){
            System.out.println("HaHa - ArithmeticException");
        }
        */

        // Problem 3
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while(flag && i<5){
            try{
                System.out.println("Enter the value of index : ");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch ( Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("ERROR");
        }

    }
}
