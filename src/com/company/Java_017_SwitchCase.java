package com.company;

import java.util.Scanner;

public class Java_017_SwitchCase {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch (age){       // condition can be integer, character, or string
            case 18:
                System.out.println("You are going to become an adult!");
                break;

            case 23:
                System.out.println("You are going to join a job!");
                break;
            case 60:
                System.out.println("You are going to retired!");
                break;
            default:
                System.out.println("Enjoy Your Life!");
        }

    }
}
