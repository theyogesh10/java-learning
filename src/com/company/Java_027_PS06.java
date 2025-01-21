package com.company;

import java.util.Scanner;

public class Java_027_PS06 {
    public static void main(String[] args) {
        //problem 1
        /*
        float [] marks = {46.5f,64.8f,91.1f,75.9f,90.5f};
        float sum = 0;
        for(float element: marks){
            sum = sum + element;
        }
        System.out.println("The value of sum : " + sum);
         */


        // Problem 2
        /*
        int [] marks = {32,43,65,67,81,75,34,64,71,98,51};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        boolean isInArray = false;
        for(int element : marks){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The given value is present in the array");
        }
        else{
            System.out.println("The given value is not present in the array");
        }
         */


        // Problem 3
        /*
        float [] marks = {46.5f,64.8f,91.1f,75.9f,90.5f};
        float sum = 0;
        for(float element: marks){
            sum = sum + element;
        }
        float avg = sum/marks.length;
        System.out.println("The value of sum : " + avg);
         */


        // Problem 4
        /*
        int [][] mat1 = {{4,5,6},{9,7,6}};
        int [][] mat2 = {{3,4,8},{5,7,3}};
        int [][] result = {{0,0,0},{0,0,0}};
        for(int i=0; i<mat1.length; i++) {               //rows number of time
            for(int j = 0; j < mat1[i].length; j++) {    //column number of time
                System.out.printf("Setting value for i=%d and j=%d\n",i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("Printing the element of 2-D Array");
        for(int i=0; i<mat1.length; i++) {               //rows number of time
            for(int j = 0; j < mat1[i].length; j++) {    //column number of time
                System.out.print(result[i][j] + " ");
            }
            System.out.print("\n");
        }
         */


        // Problem 5
        /*
        int [] arr = {1,9,2,5,3,4,8,5,7,6};
        int l = arr.length;
        int n = Math.floorDiv(arr.length,2);
        int temp;
        for(int i=0; i<n; i++){
            // swap a[i] and a[l-1-i]
            // a    b   temp
            // |4|  |6| | |
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }
        for(int element : arr){
            System.out.print(element + " ");
        }
         */


        // Problem 6
        /*
        int [] arr = {12,445,75,86,34,6,4,232,-545,23,13,54,76};
        int max = Integer.MIN_VALUE;
        for(int e : arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("The value of the maximum element in this array is : " + max);
         */


        // Problem 7
        /*
        int [] arr = {12,445,75,86,34,6,4,232,545,23,13,54,76};
        int min = Integer.MAX_VALUE;
        for(int e : arr){
            if (e<min){
                min = e;
            }
        }
        System.out.println("The value of the minimum element in this array is : " + min);
         */


        //Problem 8
        int [] arr = {2,4,7,8,9,55,87,99};
        boolean isSorted = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The Array is sorted");
        }
        else {
            System.out.println("The Array is not sorted");
        }


    }
}
