package com.company;

public class Java_032_Recursion {
    // factorial(0) = 1
    // factorial(n) = n * n-1 * ..... * 1
    // factorial(5) = 5 * 4 * 3 * 2 * 1
    // factorial(n) = n * factorial(n-1)

    // Recursive approach
    static int factorial(int n){
        // Base condition for terminate recursion
        if (n==0 || n==1){
            return 1;
        }
        else {
            return  n * factorial(n-1);
        }
    }

    // Iterative approach
    static int factorialIterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            int product = 1;
            for (int i=1; i<=n; i++){   // 1 to n
                product *= i;
            }
            return  product;
        }

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("The value of factorial n is : " + factorial(n));
        System.out.println("The value of factorial n is : " + factorialIterative(n));

    }
}
