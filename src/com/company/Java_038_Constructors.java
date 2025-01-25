package com.company;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 101;
        name = "Your Name Here!";
    }

    public MyMainEmployee(int myId, String myName){
        id = myId;
        name = myName;
    }

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class Java_038_Constructors {
    public static void main(String[] args) {
        MyMainEmployee yogi = new MyMainEmployee();
        // MyMainEmployee yogi = new MyMainEmployee(156,"Lao Tzu");
        // yogi.setId(185);
        // yogi.setName("Yogesh");
        System.out.println(yogi.getId());
        System.out.println(yogi.getName());
    }
}
