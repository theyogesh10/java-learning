package com.company;

public class Java_022_BreakAndContinue {
    public static void main(String[] args) {
        /*
        for(int i=0; i<10; i++){
            System.out.println(i);
            System.out.println("Java is wonderful!");
            if (i==2){
                System.out.println("Ending the loop");
                break;  //break loop
            }
        }
        System.out.println("Loop Ended here");

         */

        for(int i=0; i<10; i++){

            if (i==2){
                System.out.println("Continue the loop");
                continue; // skip and continue loop
            }
            System.out.println(i);
            System.out.println("Java is wonderful!");
        }
        System.out.println("Loop Ended here");
    }
}
