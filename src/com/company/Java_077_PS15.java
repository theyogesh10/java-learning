package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Java_077_PS15 {
    public static void main(String[] args) {
        // Problem 1
        /*
        ArrayList ar = new ArrayList<>();
        ar.add("Yogesh");
        ar.add("Rahul");
        ar.add("Shekhar");
        ar.add("Shivam");
        ar.add("Himanshu");
        ar.add("Ankur");
        ar.add("Rajat");
        ar.add("Mukesh");
        ar.add("Jitendra");
        ar.add("Yogeshik");
        for(Object o : ar){
            System.out.println(o); // printing iterated object
        }
        System.out.println(ar); // printing array
         */

        // Problem 2

        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());


        // Problem 3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE)+ ":" + c.get(Calendar.SECOND));

        // Problem 4
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        String myDateTime = dt.format(df);
        System.out.println(myDateTime);

        // Problem 5
        /*
        HashSet<Integer> s = new HashSet<>();
        s.add(5);
        s.add(6);
        s.add(8);
        s.add(9);
        s.add(6);
        s.add(3);
        System.out.println(s);

         */




    }
}
