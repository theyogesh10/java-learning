package com.company;

class InvalidInputException extends Exception{
    public String toString(){
        return "You cannot add 8 & 9";
    }
    public String getMessage(){
        return "You cannot add 8 & 9";
    }
}

class CannotDivideByZeroException extends Exception{
    public String toString(){
        return "You cannot divide by Zero";
    }
    public String getMessage(){
        return "You cannot divide by Zero";
    }
}

class MaxInputException extends Exception{
    public String toString(){
        return "Your Input cannot be more than 100000";
    }
    public String getMessage(){
        return "Your Input cannot be more than 100000";
    }
}

class MaxMultiplyInputException extends Exception{
    public String toString(){
        return "Your Input cannot be more than 7000 while multiplying";
    }
    public String getMessage(){
        return "Your Input cannot be more than 7000 while multiplying";
    }
}

class CustomCalculator {
    double addition(double a, double b) throws InvalidInputException, MaxInputException {
        if(a>100000 || b>100000) {
            throw new MaxInputException();
        }
        if(a==8 || b==9){
            throw new InvalidInputException();
        }
        return a+b;
    }
    double subtraction(double a, double b) throws MaxInputException {
        if(a>100000 || b>100000) {
            throw new MaxInputException();
        }
        return a-b;
    }
    double multiply(double a, double b) throws MaxInputException,MaxMultiplyInputException {
        if(a>100000 || b>100000) {
            throw new MaxInputException();
        } else if (a>7000 || b>7000) {
            throw new MaxMultiplyInputException();
        }
        return a*b;
    }
    double divide(double a, double b) throws CannotDivideByZeroException, MaxInputException {
        if(a>100000 || b>100000) {
            throw new MaxInputException();
        }
        if(b==0){
            throw new CannotDivideByZeroException();
        }
        return a/b;
    }
}

public class Java_078_Ex_CustomCalculator {
    public static void main(String[] args) throws InvalidInputException, CannotDivideByZeroException, MaxInputException, MaxMultiplyInputException {
        CustomCalculator c = new CustomCalculator();
        // c.addition(8,9);
        // c.divide(6,0);
        c.multiply(99999,38);


        /*
        Exercise 6 : You have to create a custom calculator with following operations:
        1. Addition
        2. Subtraction
        3. Multiplication
        4. Division
        Which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max input exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
         */


    }
}
