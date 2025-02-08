package com.company;

public class Java_068_Finally {
    public static int greet(){
        try {
            int a = 50;
            int b = 0;
            int c = a/b;
            return c;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up resources.... This is the end of the program");
        }
        return -1;
    }
    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
        int a = 7;
        int b = 9;
        while (true){
            try {
                System.out.println(a/b);
                break;
            }
            catch (Exception e) {
                System.out.println(e);
            }
            finally {
                System.out.println("I am finally for value of b = " + b);
            }
            b--;
        }
        try {
            System.out.println(50/3);
        }
        finally {
            System.out.println("Yes, This is finally");
        }

    }
}
