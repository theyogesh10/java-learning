package com.company;

public class Java_008_IncAndDecOperators {
    public static void main(String[] args) {

        // Increment and Decrement Operators

        int i = 56;
        int b = i++; // first b is assigned i (56) then i is increment

        int j = 34;
        int c = ++j; //first j is increment then c is assigned j ( 35)

        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);


        // Quick Quiz
        int y = 7;
        int x = ++y * 8;
        System.out.println(x);

        char ch = 'a';
        System.out.println(++ch);

    }
}
