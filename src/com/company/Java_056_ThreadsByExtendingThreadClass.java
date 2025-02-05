package com.company;

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<4000){
            System.out.println("Thread1 is Running and It's Cooking Something.....!");
            System.out.println("I am feeling hungry.....!");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<4000){
            System.out.println("Thread2 is Running and It's Chatting with someone.....!");
            System.out.println("i am feeling happy.....!");
            i++;
        }
    }
}


public class Java_056_ThreadsByExtendingThreadClass {
    public static void main(String[] args) {
        // Types of Creating a Thread
        // 1. Thread By Extending Tread Class
        MyThread1 th1 = new MyThread1();
        MyThread2 th2 = new MyThread2();
        th1.start();        // Thread start
        th2.start();        // Thread start

    }
}
