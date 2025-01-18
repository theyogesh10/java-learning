package com.company;

public class Java_013_PS03 {
    public static void main(String[] args) {
        // Problem 1
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

        // Problem 2
        String text = "You must be the change you wish to see in the world.";
        text = text.replace(" ", "_");
        System.out.println(text);

        // Problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Dayakar");
        System.out.println(letter);

        // Problem 4
        String myString = "This  string contains      double and triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem 5
        String letters = "Dear Yogesh,\n\tThis Java course is Nice.\nThanks!";
        System.out.println(letters);

    }

}
