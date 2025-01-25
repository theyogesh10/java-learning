package com.company;

class MyEmployee{
    private int id;
    private String name;

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


public class Java_036_AccessModifier {
    public static void main(String[] args) {
        MyEmployee yogi = new MyEmployee();
        // yogi.id = 123;
        // yogi.name ="Yogesh"; --> Throw an ERROR due to private access modifier

        yogi.setName("Yogesh");
        System.out.println(yogi.getName());
        yogi.setId(123);
        System.out.println(yogi.getId());
    }
}
