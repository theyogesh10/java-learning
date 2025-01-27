package com.company;

class Base1{

    Base1(){
        System.out.println("I am a Base1 class constructor");
    }
    Base1(int x){
        System.out.println("I am a Base1 class overloaded constructor with value of x as : " + x);
    }
}

class Derived1 extends Base1{

    Derived1(){
        // super(0);
        System.out.println("I am a Derived1 class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am a Derive1 class overloaded constructor with value of y as : " + y);
    }
}

class ChildOfDerived1 extends Derived1{
    ChildOfDerived1(){
        System.out.println("I am ChildOfDerived1 class constructor");
    }
    ChildOfDerived1(int x, int y, int z){
        super(x,y);
        System.out.println("I am ChildOfDerived1 class overloaded constructor with value of z as : " + z);
    }
}
public class Java_041_ConstructorsInInheritance {
    public static void main(String[] args) {

        // Base1 b = new Base1();
        // Derived1 d = new Derived1();
        // Derived1 d = new Derived1(14,18);
        ChildOfDerived1 cd = new ChildOfDerived1(11,12,13);

    }
}
