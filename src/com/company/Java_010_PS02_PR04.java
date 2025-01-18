package com.company;

import java.util.Scanner;

public class Java_010_PS02_PR04 {
    public static void main(String[] args) {

//        double v = 20;
//        double u = 10;
//        double a = 2;
//        double s = 50;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Final Velocity (v) in m/s :");
        double v = sc.nextDouble();
        System.out.println("Enter Initial Velocity (u) in m/s :");
        double u = sc.nextDouble();
        System.out.println("Enter Acceleration (a) in m/s^2 :");
        double a = sc.nextDouble();
        System.out.println("Enter Distance (s) in meters :");
        double s = sc.nextDouble();

        double res = (v*v -u*u)/(2*a*s);
        System.out.println(res);

    }
}
