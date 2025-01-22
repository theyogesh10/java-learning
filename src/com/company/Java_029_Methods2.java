package com.company;

public class Java_029_Methods2 {
    int logic(int x, int y){
        int z;
        if (x>y){
            z = x + y;
        }
        else {
            z = (x + y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
         int a = 6;
         int b = 9;
         int c;
         // Method invocation using Object creation
         Java_029_Methods2 obj = new Java_029_Methods2();
         c = obj.logic(a,b);
        System.out.println(c);
    }
}
