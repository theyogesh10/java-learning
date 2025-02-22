package com.company;

import java.io.*;
import java.util.Scanner;

public class Java_083_FileHandling {
    public static void main(String[] args) {

        // Code for CREATE a new file
        /*
        File myFile = new File("myfile10.txt");
        try {
            myFile.createNewFile();
        }
        catch (IOException e) {
            System.out.println("Unable to create this file...!");
            throw new RuntimeException(e);
        }
         */

        // Code for WRITE in a file
        /*
        try {
            FileWriter fileWriter = new FileWriter("myfile10.txt");
            fileWriter.write("Hi, This is my first file. \nThank you!");
            fileWriter.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
         */

        // Code for READ a file
        /*
        File myFile = new File("myfile10.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
         */

        // Code for DELETE a file
        File myFile = new File("myfile10.txt");
        if(myFile.delete()){
            System.out.println("Successfully deleted " + myFile.getName());
        }
        else {
            System.out.println("Some problem occurred while deleting the file...!");
        }

    }
}
