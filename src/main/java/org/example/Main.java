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

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if(isCar = true) {
            System.out.println("This is not supposed to happen.");
        }

        //Ternary Operator
        String makeOfCar = "BMW";
        boolean isDomestic = makeOfCar == "BMW" ? false : true;
        if (isDomestic){
            System.out.println("This car is domestic to our country");
        } else {
            System.out.println("This is a foreign car");
        }

        int ageOfClient = 22;
        String ageText = ageOfClient >=21 ? "is Over 21" : "Cannot be served alcohol";
        System.out.println("This client " +ageText);


//Challenge
// 1. create a double variable with a value of 20.00
// 2. create a second double variable of type double with a value of 80.00
// 3. add both numbers together, then multiply by 100.00
// 4. use the remainder operator, to figure out what the remainder from the
//   result of the operation in step three, and 40.00, will be
//  5. create a boolean variable that assigns the value true, if the remainder
//   in step four is 0.00, or false if it's not zero
//  6. output the boolean variable just to see what the result is
//  7. write an if-then statement that dispays a message, 'got some remainder', if the boolean
//   in step five is not true.


        double firstDouble = 20.00;
        double secondDouble = 80.00;
        double total = (firstDouble + secondDouble) * 100.00;
        System.out.println(total);
        double remainder = total % 40.00;
        System.out.println(remainder);
        boolean noRemainder = (remainder == 0.0) ? true : false;
        System.out.println(noRemainder);

        if (!noRemainder) {
            System.out.println("got some remainder");
        } else {
            System.out.println("no remainder");
        }

        }
    }
