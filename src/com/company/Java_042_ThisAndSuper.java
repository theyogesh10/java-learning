package com.company;

class ClassOne{
    int a;

    ClassOne(int a) {
        this.a = a;
    }
    public int getA() {
        return a;
    }
    public int returnOne(){
        return 1;
    }
}

class ClassTwo extends ClassOne{
    ClassTwo(int c){
        super(c);
        System.out.println("I am ClassTwo class constructor");
    }
}

public class Java_042_ThisAndSuper {
    public static void main(String[] args) {
        ClassOne obj1 = new ClassOne(42);
        System.out.println(obj1.getA());

        ClassTwo obj2 = new ClassTwo(45);
        System.out.println(obj2.getA());

    }
}
