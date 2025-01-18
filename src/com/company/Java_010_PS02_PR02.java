package com.company;

public class Java_010_PS02_PR02 {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);

        // Decrypting the grade
        grade = (char)(grade -8);
        System.out.println(grade);
    }
}
