package com.company;

abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the Nib");
    }
}


class Monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello Boss!");
    }
    @Override
    public void eat(){
        System.out.println("Eating");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping");
    }
}


abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone{
    void music(){
        System.out.println("Playing Music");
    }
    void video(){
        System.out.println("Watching Video");
    }
    void ring(){
        System.out.println("Ringing");
    }
    void lift(){
        System.out.println("Lifting");
    }
    void disconnect(){
        System.out.println("Disconnected");
    }
}


interface TVRemote{
    void on();
    void off();
}
interface SmartTVRemote extends TVRemote{
    void increaseVolume();
    void decreaseVolume();
}

class TV implements TVRemote{
    public void displayChannel(){
        System.out.println("Displaying Channel");
    }
    public void changeChannel(){
        System.out.println("Changing Channel");
    }
    public void on(){
        System.out.println("Turning On");
    }
    public void off(){
        System.out.println("Turning Off");
    }
}


public class Java_052_PS11 {
    public static void main(String[] args) {
        // Problem 1 + Problem 2
        // FountainPen myPen = new FountainPen();
        // myPen.changeNib();
        // myPen.write();

        // Problem 3
        // Human dhanush = new Human();
        // dhanush.sleep();

        // Problem 5
        // Monkey m1 = new Human();
        // m1.jump();
        // m1.bite();
        // m1.speak(); // Cannot use speak method because the reference is monkey which does not have speak method.

        // BasicAnimal bakadu = new Human();
        // bakadu.speak(); // error
        // bakadu.eat();
        // bakadu.sleep();

        // Problem 4
        // SmartTelephone moto = new SmartTelephone();
        // moto.video();
        // moto.disconnect();

        // Telephone nokia = new SmartTelephone();
        // nokia.ring();
        // nokia.music();  // Error reference class Telephone don't have music method, music is a method of SmartTelephone class

        // Problem 6 + Problem 7
        TV samsung = new TV();
        samsung.on();
        samsung.off();
        samsung.displayChannel();
        samsung.changeChannel();

    }
}
