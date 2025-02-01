package com.company;

interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording Video in 4K");
    }
}

interface MyWiFi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall() {
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements MyCamera, MyWiFi{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo() {
        System.out.println("Recording Video");
    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = { "Pradnya2G", "Dnyaneshwar4G", "Madhavan5G"  };
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
    // public void record4KVideo(){
    //     System.out.println("Taking snap and Recording Video in 4K");
    // }
}

public class Java_049_DefaultMethods {
    public static void main(String[] args) {

        MySmartPhone msp = new MySmartPhone();
        msp.record4KVideo();
        // msp.greet(); // Throws an error because it is private method

        String[] arr = msp.getNetworks();
        for (String item : arr){
            System.out.println(item);
        }



    }
}
