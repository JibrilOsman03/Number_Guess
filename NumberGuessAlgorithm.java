package com.example.numberguess;

import java.lang.Math;

public class NumberGuessAlgorithm {
    private int randomNumber;
    private int guessesLeft;
    private boolean isSpeed;

    //Object initializer
    //return chosen mode as a string

    public NumberGuessAlgorithm (String mode){
        this.randomNumber = -1;

        //This code calculates how much guesses a user gets depending
        //on their difficulty choice
        if (mode.equals("Easy")){
            this.guessesLeft = 10;
            this.isSpeed = false;
        }
        if (mode.equals("Medium")){
            this.guessesLeft = 5;
            this.isSpeed = false;
        }
        if (mode.equals("Hard")){
            this.guessesLeft = 3;
            this.isSpeed = false;
        }
        if (mode.equals("Speed")) {
            this.guessesLeft = 100;
            this.isSpeed = true;
        }
    }

    //This line calculates the value of the random number
    public void guessAmount(int x){
        this.randomNumber = (int) (Math.random() * (x)) + 1;
    }

    //This line checks if the user guesses the correct number
    public boolean userGuess(int guess){
        if (guess == this.randomNumber) {
            if (!this.isSpeed)
                this.guessesLeft--;
            return true;
        }
        else{
            if (!this.isSpeed)
                this.guessesLeft--;
            return false;
        }
    }

    public void setGuessesLeft(int guessesLeft)
    {
        this.guessesLeft = guessesLeft;
    }


    //This line returns how many guesses are left
    public int getGuessesLeft(){
        return  this.guessesLeft;
    }

    public static int toInt(String s)
    {
        return Integer.parseInt(s);
    }

}
