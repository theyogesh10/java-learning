package com.company;

class MyThreadCons extends Thread{
    public MyThreadCons(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        System.out.println("Thank You...!");
//         while(i<1000) {
//            System.out.println("I am a Thread");
//            i++;
//        }
    }
}

class MyRunnableThreadCons implements Runnable{
    private String trName;
    public MyRunnableThreadCons(String name){
        this.trName = name;
    }
    public void run(){
        System.out.println("Hello, " + trName);
    }
}

public class Java_058_ThreadConstructor {
    public static void main(String[] args) {

//        MyThreadCons t1 = new MyThreadCons("Yogesh");
//        MyThreadCons t2 = new MyThreadCons("Ajas");
//        t1.start();
//        t2.start();
//        System.out.println("The ID of the Thread is " + t1.getId());
//        System.out.println("The name of the Thread is " + t1.getName());
//        System.out.println("The ID of the Thread is " + t2.getId());
//        System.out.println("The name of the Thread is " + t2.getName());

        MyRunnableThreadCons rt1 = new MyRunnableThreadCons("Yogesh");
        Thread t1 = new Thread(rt1, "Yogesh");
        MyRunnableThreadCons rt2 = new MyRunnableThreadCons("Akash");
        Thread t2 = new Thread(rt2,"Akash");
        t1.start();
        t2.start();
        System.out.println("The ID of the Thread is " + t1.getId());
        System.out.println("The Name of the Thread is " + t1.getName());
        System.out.println("The ID of the Thread is " + t2.getId());
        System.out.println("The Name of the Thread is " + t2.getName());

    }
}
