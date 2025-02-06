package com.company;

class MyNewThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (true){       // While(i<4000){
            System.out.println("My Thread 1");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}

class MyNewThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<4000){
            System.out.println("My Thread 2");
            i++;
        }
    }
}

public class Java_060_ThreadMethods {
    public static void main(String[] args) {
        MyNewThread1 t1 = new MyNewThread1();
        MyNewThread2 t2 = new MyNewThread2();
        t1.start();

//        try{
//            t1.join();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }

        t2.start();

    }
}
