package com.company;

public class Java_030_MethodOverloading {
    static void tellJoke(){         // void return type
        System.out.println("I invented a new word!\n" + "Plagiarism!");
    }
    static void change(int a){
        a = 96;
    }
    static void changeArray(int [] arr){
        arr[0] = 96;
    }


    static void foo(){
        System.out.println("Good morning bro!");
    }
    static void foo(int a){
        System.out.println("Good morning bro! " + a);
    }
    static void foo(int a, int b){
        System.out.println("Good morning bro! " + a);
        System.out.println("Good morning bro! " + b);
    }


    public static void main(String[] args) {
//        tellJoke();

        // Case 1 : Changing the Integer
        // int x = 45;
        // change(x);
        // System.out.println("The value of x after running change is : " + x);

        // Case 2 : Changing the Array (It is Passing reference that's by its changing)
        // int [] marks = {54,76,89,57,98,79};
        // changeArray(marks);
        // System.out.println("The value of x after running change is : " + marks[0]);


        // Method overloading
        foo();
        foo(3000);
        foo(4000, 5000);

        // Method overloading cannot be performed by changing the return type of methods

    }
}
