package com.company;

public class Java_031_VarArgs{
    /*
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b;
    }
     */

    static int sum(int x, int ...arr){     // Available as int [] arr;
        int result = x;
        for(int a : arr){
            result += a;
        }
        return result;

    }
    public static void main(String[] args) {
        // System.out.println("The sum of Nothing is : " + sum());
        System.out.println("The sum of 1 is : " + sum(1));
        System.out.println("The sum of 4 and 5 is : " + sum(4,5));
        System.out.println("The sum of 6, 7 and 8 is : " + sum(6,7,8));
        System.out.println("The sum of 5, 6, 7 and 8 is : " + sum(5,6,7,8));
        System.out.println("The sum of 4, 5, 6, 7 and 8 is : " + sum(4,5,6,7,8));
    }
}