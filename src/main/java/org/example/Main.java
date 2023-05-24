package org.example;

public class Main {
    public static void main(String[] args) {
//print line
        System.out.printf("Hello my name is Zach!");

//basic if statement
        boolean isAlien = false;
        if (isAlien == false){
            System.out.println("That's not an Alien!");
        }

        int topScore = 100;
        if (topScore > 100) {
            System.out.println("You got the high score!");
        }
//&& example
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

// or || example
        if((topScore < 90) || (secondTopScore <= 90)){
            System.out.println("either or both of the conditions are true");
        }
    }
}