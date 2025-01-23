package com.company;

public class Java_033_PS07 {
    static void multiplication(int n){
        for (int i=1; i<=10; i++) {
            System.out.format("%d × %d = %d \n", n, i, n * i);
        }
    }

    static void pattern1(int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static int sumRec(int n){
        // Base condition
        if (n==1){
            return 1;
        }
        else {
            return n + sumRec(n-1);
        }
    }

    static void pattern2(int n){
        for (int i=0; i<n; i++){
            for (int j=n; j>i; j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static int fibanacci(int n){
        /*
        if(n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
         */
        if (n==1 || n==2){
            return n-1;
        }
        else {
            return fibanacci(n-1) + fibanacci(n-2);
        }
    }

    static int avg(int ...arr){
        int sum = 0;
        for (int a : arr){
            sum += a;
        }
        return (sum/arr.length);
    }

    static void patternRec1(int n){
        if (n>0){
            patternRec1(n-1);
            for (int i=0; i<n; i++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static void patternRec2(int n){
        if (n>0){
            for (int i=0; i<n; i++){
                System.out.print("*");
            }
            System.out.print("\n");
            patternRec2(n-1);
        }
    }

    static double celsiusToFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }

    static int sum(int n){
        int sum = 0;
        for (int i=0; i<=n;i++){
            sum += i;
        }
        return sum;
    }


    public static void main(String[] args) {

        // Problem 1
        // multiplication(7);

        // Problem 2
        // pattern1(5);

        // Problem 3
        // int c = sumRec(4);
        // System.out.println(c);

        // Problem 4
        // pattern2(5);

        // Problem 5
        // Fibonacci Series  => 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

        // int result = fibanacci(5);
        // System.out.println(result);

        // int term = 5;
        // for ( int i=1; i<=term; i++){
        //     System.out.print(fibanacci(i) + " ");
        // }

        // Problem 6
        // int result = avg(1,2,3,4,5,6,7,8,9);
        // System.out.println("Average : " + result);

        // Program 7
        // patternRec1(5);

        // Program 8
        // patternRec2(5);

        // Program 9
        // double celsius = 34;
        // double fahrenheit = celsiusToFahrenheit(celsius);
        // System.out.println(celsius + " Celsius is equal to " + fahrenheit + " fahrenheit");

        // Problem 10
        int result = sum(10);
        System.out.println(result);

    }
}
