package com.company;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

public class Java_066_ExceptionClass {
    public static void main(String[] args) {
        int a = 8;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a<9){
            try {
                throw new MyException();
                // throw new ArithmeticException("This is a ArithmeticException");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                // System.out.println(e);      // default toString()
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Final Finished");
        }
    }
}
