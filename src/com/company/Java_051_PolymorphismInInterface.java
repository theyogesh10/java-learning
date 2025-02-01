package com.company;

interface MyCamera2{
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

interface MyWiFi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2 {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall() {
        System.out.println("Connecting...");
    }
}
class MySmartPhone2 extends MyCellPhone implements MyCamera2, MyWiFi2{
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
    public void sampleMeth(){
        System.out.println("Sample Method");
    }
}

public class Java_051_PolymorphismInInterface {
    public static void main(String[] args) {

        MyCamera2 cam1 = new MySmartPhone2();   // This is a smartphone but, use it as a camera
        // cam1.getNetwork(); // Not Allowed
        // cam1.sampleMeth(); // Not Allowed

        cam1.record4KVideo();

        MySmartPhone2 sp = new MySmartPhone2();
        sp.sampleMeth();
        sp.recordVideo();
        sp.getNetworks();
        sp.callNumber(205205);
    }
}
