package com.company;

class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing");
    }
    public void vibrate(){
        System.out.println("Vibrating");
    }
    public void callFriend(){
        System.out.println("Call to Friend");
    }
}

class Square{
    int side;

    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Rectangle{
    double length;
    double width;

    public double area(){
        return length * width;
    }
    public double perimeter(){
        return 2 * (length + width);
    }
}

class TommyVercetti{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

class Circle{
    double radius;

    public double area(){
        return 3.1416 * radius * radius;
    }
    public double perimeter(){
        return 2 * 3.1416 * radius;
    }
}


public class Java_035_PS08 {
    public static void main(String[] args) {
        // Problem 1
        /*
        Employee1 yogi = new Employee1();
        yogi.setName("Yogesh");
        yogi.salary = 35000;
        System.out.println(yogi.getName());
        System.out.println(yogi.getSalary());
         */

        // Problem 2
        /*
        CellPhone vivo = new CellPhone();
        vivo.ring();
        vivo.vibrate();
        vivo.callFriend();
         */

        // Problem 3
        /*
        Square sq1 = new Square();
        sq1.side = 5;
        System.out.println(sq1.area());
        System.out.println(sq1.perimeter());
         */

        // Problem 4
        /*
        Rectangle rect1 = new Rectangle();
        rect1.length = 5;
        rect1.width = 4;
        System.out.println(rect1.area());
        System.out.println(rect1.perimeter());
         */

        // Problem 5
        /*
        TommyVercetti player1 = new TommyVercetti();
        player1.hit();
        player1.run();
        player1.fire();
         */

        // Problem 6
        Circle cicle1 = new Circle();
        cicle1.radius = 5.56;
        System.out.println(cicle1.area());
        System.out.println(cicle1.perimeter());


    }
}
