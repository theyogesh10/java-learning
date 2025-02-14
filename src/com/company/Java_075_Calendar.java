package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Java_075_Calendar {
    public static void main(String[] args) {

         // Calendar class an abstract class

         // Calendar c = Calendar.getInstance();
         // System.out.println(c.getCalendarType());
         // System.out.println(c.getTimeZone());

        Calendar c1 = Calendar.getInstance();
        System.out.println(c1.getTime());
        System.out.println(c1.get(Calendar.DATE));
        System.out.println(c1.get(Calendar.SECOND));
        System.out.println(c1.get(Calendar.HOUR));
        System.out.println(c1.get(Calendar.HOUR_OF_DAY));
        System.out.println(c1.get(Calendar.HOUR_OF_DAY) + ":" + c1.get(Calendar.MINUTE) + ":" + c1.get(Calendar.SECOND));

        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2000));

    }
}