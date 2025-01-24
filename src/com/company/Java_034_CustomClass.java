package com.company;

class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My ID is : " + id);
        System.out.println("My name is : " + name);
    }
    public int getSalary(){
        return salary;
    }
}
public class Java_034_CustomClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee yogi = new Employee();     // Instantiating a new Employee Object
        Employee shivam = new Employee();

        // Setting Attribute
        yogi.id = 101;
        yogi.name = "Yogesh";
        yogi.salary = 35000;

        shivam.id = 201;
        shivam.name = "Shivam Maheshwari";
        shivam.salary = 40000;


        // Printing the properties
        yogi.printDetails();
        shivam.printDetails();
        int salary = shivam.getSalary();
        System.out.println(salary);

        // System.out.println(yogi.id);
        // System.out.println(yogi.name);

    }
}
