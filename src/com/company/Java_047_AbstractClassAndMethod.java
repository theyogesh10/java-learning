package com.company;

abstract class Parent1{
    public Parent1(){
        System.out.println("I am a constructor of Base2");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child1 extends Parent1{
    @Override
    public void greet(){
        System.out.println("Good Morning...!");
    }
    @Override
    public void greet2(){
        System.out.println("Good Afternoon...!");
    }
}

abstract class Child2 extends Parent1 {
    public void good() {
        System.out.println(" I am Good");
    }
}


public class Java_047_AbstractClassAndMethod {
    public static void main(String[] args) {
        // Parent1 p1 = new Parent1();     // Error Because Abstract Class
        Child1 c = new Child1();
        // Child2 c2 = new Child2();        // Error Because Abstract Class
    }
}
