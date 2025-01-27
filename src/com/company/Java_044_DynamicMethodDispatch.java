package com.company;

import org.w3c.dom.ls.LSOutput;

class Phone{
    public void showTime(){
        System.out.println("Time is 6 PM ");
    }
    public void on(){
        System.out.println("Turning on Phone...!");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...!");
    }
    public void on(){
        System.out.println("Turing on SmartPhone...!");
    }
}
public class Java_044_DynamicMethodDispatch {
    public static void main(String[] args) {
        // Phone obj1 = new Phone();               // Allowed
        // SmartPhone obj2 = new SmartPhone();     // Allowed
        // obj1.name();

        Phone obj = new SmartPhone();       // Yes it is allowed  // Superclass object = new SubClass(); // Reference of SuperClass but Object of SubClass allowed
        // SmartPhone obj2 = new Phone();      // Not Allowed

        obj.showTime();
        obj.on();       // Running SmartPhone() object
        // obj.music();    // Not Allowed
    }
}
