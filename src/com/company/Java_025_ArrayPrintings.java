package com.company;

public class Java_025_ArrayPrintings {
    public static void main(String[] args) {
        /*
        float [] marks = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f};
        System.out.println(marks[2]);
        System.out.println(marks.length);

        String [] student = {"Shivam", "Vijay", "Ubaish", "Arjun", "Sameer"};
        System.out.println(student.length);
        System.out.println(student[2]);

         */


        int [] marks = {98, 45, 79, 99, 80};

        // Displaying the Array (Naive way)
        System.out.println("Printing array using naive way :");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying the Array (For Loop)
        System.out.println("Printing array using for loop: ");
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        // Reverse Printing
        System.out.println("Printing array in reverse order : ");
        for(int i=marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }

        // Displaying the Array (For-Each Loop)
        System.out.println("Printing array using for-each loop : ");
        for(int element: marks){
            System.out.println(element);
        }




    }
}
