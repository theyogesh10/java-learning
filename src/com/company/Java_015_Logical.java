package com.company;

public class Java_015_Logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("For Logical AND...");
        if(a && b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }


        System.out.println("For Logical OR...");
        if(a || b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }


        System.out.println("For Logical OR...");
        System.out.println("Not(a) is : ");
        System.out.println(!a);
        System.out.println("Not(b) is : ");
        System.out.println(!b);

    }
}
