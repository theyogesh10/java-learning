package com.company;

class A{
    public int a;
    public int method1(){
        return 4;
    }
    public void method2(){
        System.out.println("I am method2 of class A");
    }
}
class B extends A{
    @Override
    public void method2(){      // Method Overriding
        System.out.println("I am method2 of class B");
    }
    public void method3(){
        System.out.println("I am method3 of class B");
    }
}

public class Java_043_MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.method2();

        B b = new B();
        b.method2();
    }
}
