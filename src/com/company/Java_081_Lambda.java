package com.company;

@FunctionalInterface
interface AnoDemoInterface{
    void meth1(int a);
//    void meth2();
}

//class MyClass implements AnoDemoInterface{
//
//    @Override
//    public void meth1() {
//        System.out.println("This is New Method 1");
//    }
//}

//class AnonymousDemoClass implements AnoDemoInterface{
//    public void display(){
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("This is Method 1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("This is Method 2");
//    }
//}

public class Java_081_Lambda {

    public static void main(String[] args) {

//        AnonymousDemoClass ref = new AnonymousDemoClass();
//        AnoDemoInterface ref = new AnonymousDemoClass();
//        ref.meth1();

        // Anonymous Classes
//        AnoDemoInterface ref = new AnoDemoInterface() {
//            @Override
//            public void meth1() {
//                System.out.println("This is Method 1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("This is Method 2");
//            }
//        };
//            ref.meth1();

        // LAMBDA EXPRESSIONS
//        AnoDemoInterface ref = new MyClass();
//        ref.meth1();

        AnoDemoInterface ref = (a)->{
            System.out.println("This is Method 1 from this Lambda " + a);
        };
        ref.meth1(87 );
    }
}
