package com.company;

public class Java_023_PS05 {
    public static void main(String[] args) {
        // Problem 1
        /*
        int n = 4;
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
            System.out.print("*");
            }
            System.out.print("\n");
        }
         */


        // Problem 2
        /*
        int sum = 0;
        int n = 5;         // first 5 even number is 0 2 4 6 8 = 20
        for(int i=0; i<n; i++){
            sum = sum + (2*i);   // 2i for even number
        }
        System.out.print("Sum of even number is : ");
        System.out.println(sum);
         */


        // Problem 3
        /*
        int n = 5;
        for(int i=1; i<=10; i++){
            System.out.printf("%d × %d = %d\n", n, i, n*i);
        }
         */


        // Problem 4
        /*
        int n = 10;
        for(int i=10; i>=1; i--){
            System.out.printf("%d × %d = %d\n", n, i, n*i);
        }
         */


        // Problem 5   // factorial n = n * n-1 * n-2 ..... 1  => 5! = 5*4*3*2*1
        /*
        int n = 5;
        int factorial = 1;
        for(int i=1; i<=n; i++){
            factorial = factorial*i;
        }
            System.out.println(factorial);
         */


        // Problem 6
        /*
        int n = 5;
        int factorial = 1;
        int i = 1;
        while(n>=i){
            factorial = factorial*i;
            i++;
        }
        System.out.println(factorial);
         */


        // Problem 7
        /*
        int n = 4;
        int i = n;
        while(i>0){
            int j = 0;
            while(j<i){
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i--;
        }
         */


        // Problem 8
        /*
        int n = 8;
        int sum = 0;
        for(int i=1; i<=10; i++){
            sum += n*i;
        }
        System.out.println(sum);
         */


        //  Problem 9
        int n = 5;
        int sum = 0;
        int i = 0;
        while(i<n){
            sum = sum + (2*i);
            i++;
        }
            System.out.println(sum);

    }
}
