package com.company;

class PracticeClassA extends Thread{
    public void run(){
        while(true){
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Good Morning...!");
        }
    }
}

class PracticeClassB extends Thread{
    public void run(){
//        while(false){
//            try {
//                Thread.sleep(200);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//            System.out.println("Welcome...!");
//        }
    }
}

public class Java_061_PS13 {
    public static void main(String[] args) {
        PracticeClassA p1 = new PracticeClassA();
        PracticeClassB p2 = new PracticeClassB();
        p1.setPriority(6);
        p1.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());

        // p1.start();
         p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
