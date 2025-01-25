package com.company;

import java.util.Random;
import java.util.Scanner;

public class Java_037_Ex_RockPaperScissors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter - \n0 for Rock\n1 for Paper\n2 for Scissor\n: ");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput<3){
            if (userInput == computerInput){
                System.out.println("Draw");
            }
            else if (userInput == 0 && computerInput ==2  || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1 ) {
                System.out.println("Congratulation, You Win!");
            }
            else {
                System.out.println("Oops....!, Computer Win!");
            }

            if(computerInput==0){
                System.out.println("Computer Choice : Rock");
            } else if (computerInput==1) {
                System.out.println("Computer Choice : Paper");
            } else if (userInput==2) {
                System.out.println("Computer Choice : Scissor");
            }

        }
        else{
            System.out.println("You choose Invalid option!");
        }

    }
}
