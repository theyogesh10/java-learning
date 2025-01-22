package com.company;

public class Java_028_Methods {
    static int logic(int x, int y){
        int z;
        if (x>y){
            z = x + y;
        }
        else {
            z = (x + y) * 5;
        }
        x = 545;
        return z;
    }
    public static void main(String[] args) {
         int a = 6;
         int b = 9;
         int c;
         c = logic(a,b);
        System.out.println(a + " "+ b);
        System.out.println(c);

        int a1 = 5;
        int b1 = 2;
        int c1;
        c1 = logic(a1,b1);
        System.out.println(c1);
    }
}
