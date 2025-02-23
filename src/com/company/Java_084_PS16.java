package com.company;

import java.io.FileWriter;
import java.io.IOException;

class MyDeprecated{
    @Deprecated
    void meth1(){
        System.out.println("I am Method 1");
    }
}

interface MyInterface{
    void display();
}

public class Java_084_PS16 {
    public static void main(String[] args) {

        /*
        MyDeprecated d = new MyDeprecated();
        d.meth1();
         */
        /*
        MyInterface mi = new MyInterface() {
            @Override
            public void display() {
                System.out.println("I am display method");
            }
        };
         */

        int n = 7;
        String table = "";
        for (int i = 0; i < 10; i++) {
            table += n + "×" + (i+1) + "=" + n*(i+1);
            table += "\n";

        }
        try {
            FileWriter myFile = new FileWriter("MyFileTest.txt");
            myFile.write(table);
            myFile.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
