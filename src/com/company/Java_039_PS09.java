package com.company;

class Cylinder{
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double surfaceArea(){
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
}

class MyRectangle{
    private double length;
    private double breadth;

    public MyRectangle() {
        this.length = 4;
        this.breadth = 5;
    }
    public MyRectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getBreadth() {
        return breadth;
    }
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
}

class Sphere{
    private double radius;

    public Sphere() {
        this.radius = 2;
    }
    public Sphere(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double surfaceArea(){
        return 4 * Math.PI * radius * radius;
    }
    public double volume(){
        return 4.0/3.0 * Math.PI * radius * radius * radius;
    }
}


public class Java_039_PS09 {
    public static void main(String[] args) {

        // Problem 1 - Getter & Setter
        /*
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(12);
        myCylinder.setRadius(9);
        System.out.println(myCylinder.getHeight());
        System.out.println(myCylinder.getRadius());
         */

        // Problem 2 - Getter & Setter
        /*
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(12);
        myCylinder.setRadius(9);
        System.out.println(myCylinder.getHeight());
        System.out.println(myCylinder.getRadius());
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
         */

        // Problem 3 - Constructor
        /*
        Cylinder myCylinder = new Cylinder(9,12);
        System.out.println(myCylinder.getHeight());
        System.out.println(myCylinder.getRadius());
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
         */

        // Problem 4
        /*
        MyRectangle myNewRectangle = new MyRectangle(12,13); //  Constructor Overloading
        System.out.println(myNewRectangle.getLength());
        System.out.println(myNewRectangle.getBreadth());

        MyRectangle myNewRectangle1 = new MyRectangle(); // Using Getter & Setter & Constructor
        myNewRectangle1.setLength(22);
        myNewRectangle1.setBreadth(23);
        System.out.println(myNewRectangle1.getLength());
        System.out.println(myNewRectangle1.getBreadth());
         */

        // Problem 5
        Sphere mySphere = new Sphere();
        mySphere.setRadius(5);
        System.out.println(mySphere.getRadius());
        System.out.println(mySphere.surfaceArea());
        System.out.println(mySphere.volume());

        Sphere mySphere1 = new Sphere(8);
        System.out.println(mySphere1.getRadius());
        System.out.println(mySphere1.surfaceArea());
        System.out.println(mySphere1.volume());

    }
}
