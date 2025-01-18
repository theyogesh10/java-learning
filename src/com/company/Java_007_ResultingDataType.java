package com.company;

public class Java_007_ResultingDataType {
    public static void main(String[] args) {

        /*
        Resulting Data Type after Arithmetic Operations
        result = byte + short --> int
        result = short + int --> int
        result = long + float --> float
        result = int + float --> float
        result = char + int --> int
        result = char + short --> int
        result = long + double --> double
        result = float + double --> double
        */

        byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.54f + x;
        System.out.println(b);


    }
}
