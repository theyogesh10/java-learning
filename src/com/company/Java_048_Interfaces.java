package com.company;

interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    void blowHornK35();
    void blowHornR1();
}

class AvonCycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("Pee Pee Pee Po Po");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
    public void blowHornK35(){
        System.out.println("K35 Horn... Po Po Po");
    }
    public void blowHornR1(){
        System.out.println("R1 Horn... Dha Dha Dha");
    }
}

public class Java_048_Interfaces {
    public static void main(String[] args) {
        AvonCycle mycycle = new AvonCycle();
        mycycle.applyBrake(1);
        // You can create properties in interface
        System.out.println(mycycle.a);

        // You cannot modify the properties in interfaces as they are final
        // mycycle.a = 324;
        // System.out.println(mycycle.a);

        mycycle.blowHorn();
        mycycle.blowHornK35();
        mycycle.blowHornR1();


    }
}
