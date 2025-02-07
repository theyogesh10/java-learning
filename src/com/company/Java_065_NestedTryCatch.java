package com.company;

import java.util.Scanner;

public class Java_065_NestedTryCatch {
    public static void main(String[] args) {
        int [] marks = new int[4];
        marks[0] = 27;
        marks[1] = 56;
        marks[2] = 71;
        marks[3] = 43;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag){
            System.out.println("Enter the array index number : ");
            int ind = sc.nextInt();

            try{
                System.out.println("Welcome to TechSphere....!");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Sorry this index does not exist.");
                    System.out.println("Exception in Level 2");
                }
            }
            catch (Exception e){
                System.out.println("Exception in Level 1");
            }
        }
        System.out.println("Thanks for using this program :) ");

    }
}
