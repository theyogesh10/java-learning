package com.company;
class MyThreadPr1 extends Thread{
    public MyThreadPr1(String name){
        super(name);
    }
    @Override
    public void run(){
        int i = 0;
        while (i<4000){
            System.out.println("Good morning, " + this.getName());
            i++;
        }
    }
}

public class Java_059_ThreadPriorities {
    public static void main(String[] args) {
        MyThreadPr1 t1 = new MyThreadPr1("Yogesh1");
        MyThreadPr1 t2 = new MyThreadPr1("Yogesh2");
        MyThreadPr1 t3 = new MyThreadPr1("Yogesh3");
        MyThreadPr1 t4 = new MyThreadPr1("Yogesh4");
        MyThreadPr1 t5 = new MyThreadPr1("Yogesh5 (most important)");
        t5.setPriority(Thread.MAX_PRIORITY);    // MAX_PRIORITY
        t1.setPriority(Thread.MIN_PRIORITY);    // MIN_PRIORITY
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);   // NORM_PRIORITY
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
