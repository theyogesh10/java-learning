package com.company;

/**
 * This is a Demo class for JavaDoc
 */

public class Java_079_MethodTag {

    /**
     * This is a main method
     * @param args These are arguments supplied to the command line
     */

    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     * This is a add method
     * @param i This is the first number to add
     * @param j This is the second number to add
     * @return Sum of two numbers as an integer
     * @throws Exception if i is 0
     * @deprecated This method is deprecated please use + operator
     */

    public int add(int i, int j) throws Exception{
        if(i==0){
            throw new Exception();
        }
        int c;
        c=i+j;
        return c;
    }

}
