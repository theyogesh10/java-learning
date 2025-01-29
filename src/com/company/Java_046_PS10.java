package com.company;

class Circle1{
    public int radius;
    Circle1(int r){
        this.radius = r;
    }
    public double area(){
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder1 extends Circle1{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        this.height = h;
    }
    public double volume(){
        return this.area() * this.height;
    }
}

class Rectangle1{
    public int length;
    public int breadth;
    Rectangle1(int l, int b){
        this.length = l;
        this.breadth = b;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public int area(){
        return this.length * this.breadth;
    }
    public int perimeter(){
        return 2 * (this.length + this.breadth);
    }
}

class Cuboid1 extends Rectangle1{
    public int height;
    Cuboid1(int l, int b, int h){
        super(l,b);
        this.height = h;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int volume(){
        return this.area() * this.height;
    }
    public int surfaceArea(){
        return 2 * ((this.length * this.breadth) + (this.breadth * this.height) + (this.length * this.height));
    }
}

public class Java_046_PS10 {
    public static void main(String[] args) {
        // Problem 1
        // Circle1 cr1 = new Circle1(12);
        // System.out.println("Area of Circle : " + cr1.area());

        // Cylinder1 cyl1  = new Cylinder1(5,7);
        // System.out.println("Volume of Cylinder : " + cyl1.volume());

        // Problem 2
        // Rectangle1 r1 = new Rectangle1(3,5);
        // System.out.println("Area of Rectangle : " + r1.area());
        // System.out.println("Perimeter of Rectangle : " + r1.perimeter());

        Cuboid1 cb1 = new Cuboid1(4,6,7);

        cb1.setLength(10);
        cb1.setBreadth(12);
        cb1.setHeight(6);

        System.out.println("Volume of Cuboid : " + cb1.volume());
        System.out.println("Surface Area of Cuboid : " + cb1.surfaceArea());

    }
}
