package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Java_076_JavaTime {
    public static void main(String[] args) {

        /*
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
         */

        // DateTimeFormatter
        LocalDateTime dt = LocalDateTime.now();     // date
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy, E, H:m a");       // format
        String myDate = dt.format(df);      // creating date string using date format
        System.out.println(myDate);

        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate2 = dt.format(df2);
        System.out.println(myDate2);

    }
}
