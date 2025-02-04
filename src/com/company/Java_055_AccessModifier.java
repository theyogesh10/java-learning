package com.company;

class C1{
    public int x = 5;
    protected int y = 10;
    int z = 15;
    private int a = 20;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class Java_055_AccessModifier {
    public static void main(String[] args) {
        C1 c = new C1();
        // c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a); // no access in same package
    }
}
