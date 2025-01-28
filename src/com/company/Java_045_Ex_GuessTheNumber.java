package com.company;

import java.util.Random;
import java.util.Scanner;

// Game class handles the main logic of the guessing game
class Game{
    public int number;                  // The randomly generated number the user needs to guess
    public int inputNumber;             // The user's current guess
    public int numberOfGuesses = 0;     // Counter for the number of guesses the user has made

    // Getter method to return the number of guesses
    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }
    // Setter method to set the number of guesses
    public void setNumberOfGuesses(int numberOfGuesses) {
        this.numberOfGuesses = numberOfGuesses;
    }

    // Constructor to generate a random number between 0 and 100
    Game() {
        Random rand = new Random();                 // Create an instance of the Random class to generate random numbers
        this.number = rand.nextInt(101);     // Generate a random number between 0 and 100 and assign it to the number variable
    }

    // Method to take user input (the guess)
    public void takeUserInput(){
        System.out.println("Guess the number : ");      // Prompt the user to guess a number
        Scanner sc = new Scanner(System.in);            // Create a scanner object to read user input
        inputNumber = sc.nextInt();                     // Read the user's input and store it in the inputNumber variable
    }
    // Method to check if the user's guess is correct
    boolean isCorrectNumber(){
        numberOfGuesses++;                              // Increment the guess count after each attempt
        if (inputNumber == number){                     // If the guess is correct
            // Print a success message with the correct number and the number of guesses made
            System.out.format("Yes you guessed it right, it was %d \nand you guessed it in %d attempts", number, numberOfGuesses);
            return true;                                // Return true to indicate that the guess is correct
        }
        else if (inputNumber>number){                   // If the guess is higher than the correct number
            System.out.println("This is Higher");       // Inform the user that their guess is too high
        }
        else if (inputNumber<number){                   // If the guess is lower than the correct number
            System.out.println("This is Lower");        // Inform the user that their guess is too low
        }
        return false;                                   // Return false indicating that the guess is incorrect
    }
}

// Main class that starts the game
public class Java_045_Ex_GuessTheNumber {
    public static void main(String[] args) {

        Game g = new Game();            // Create a new Game object, which generates the random number
        boolean b = false;              // A flag to control the game loop (false means the game is still running)
        // Start a loop that keeps running until the user guesses the correct number
        while (!b){
            g.takeUserInput();          // Prompt the user to enter their guess
            b = g.isCorrectNumber();    // Check if the guess is correct. If correct, exit the loop (set 'b' to true)
        }

    }
}
