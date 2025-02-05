package com.company;

class MyThreadRunnable1 implements Runnable{
    public void run(){
        int i = 0;
        while (i<4000) {
            System.out.println("I am My Runnable Thread 1");
            i++;
        }
    }
}

class MyThreadRunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while (i<4000) {
            System.out.println("I am My Runnable Thread 2");
            i++;
        }
    }
}

public class Java_057_ThreadsByImplementingRunnableInterface {
    public static void main(String[] args) {

        // 2. Thread By Implementing Runnable Interface
        MyThreadRunnable1 runnableTh1 = new MyThreadRunnable1();
        Thread th1 = new Thread(runnableTh1);
        MyThreadRunnable2 runnableTh2 = new MyThreadRunnable2();
        Thread th2 = new Thread(runnableTh2);
        th1.start();    // Thread start
        th2.start();

    }
}
