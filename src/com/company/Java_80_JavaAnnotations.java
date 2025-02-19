package com.company;

@FunctionalInterface
interface MyFunctionalInterface{
    void thisMethod();
}

class NewPhone extends Phone{
    @Override
    public void showTime() {
        System.out.println("Time is 11 PM");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}

public class Java_80_JavaAnnotations {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        NewPhone phone = new NewPhone();
        phone.showTime();
        phone.sum(5,6);

    }
}
