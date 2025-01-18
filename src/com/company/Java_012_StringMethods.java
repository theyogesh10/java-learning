package com.company;

public class Java_012_StringMethods {
    public static void main(String[] args) {
        String name = "Sphere";
        System.out.println(name);

//        int value = name.length();
//        System.out.println(value);
//
//        String lString = name.toLowerCase();
//        System.out.println(lString);
//
//        String uString = name.toUpperCase();
//        System.out.println(uString);
//
//        String nonTrimmedString = "       Sphere     ";
//        System.out.println(nonTrimmedString);
//
//        String trimmedString = nonTrimmedString.trim();
//        System.out.println(trimmedString);

//        System.out.println(name.substring(2));
//
//        System.out.println(name.substring(2,4));
//
//        System.out.println(name.replace('o', 'u'));
//
//        System.out.println(name.replace("phe", "ha"));
//        System.out.println(name.replace("Sp", "t"));
//
//        System.out.println(name.startsWith("Sp"));    //true
//        System.out.println(name.startsWith("re"));    //false
//
//        System.out.println(name.endsWith("Sph"));    //false
//        System.out.println(name.endsWith("ere"));    //true
//
//        System.out.println(name.charAt(2));

//        System.out.println(name.indexOf("e"));
//
//        String modifiedName = "Sphereherehere";
//        System.out.println(modifiedName.indexOf("her"));
//        System.out.println(modifiedName.indexOf("her", 4));

//        System.out.println(modifiedName.lastIndexOf("he"));
//        System.out.println(modifiedName.lastIndexOf("he",8));

        System.out.println(name.equals("Sphere"));

        System.out.println(name.equalsIgnoreCase("sphere"));


        // Escape sequence character

        System.out.println("I am escape sequence \" double quotes \t tab \\ backslash \n newline");

    }
}
