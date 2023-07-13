package Challenges;

/*
create a for loop using a range of numbers from 1 to 1000
sum all the numbers that can be divided by 3 and 5
print out all the numbers that have met the above conditions
break out of the loop when you have found 5 numbers that have met those conditions
After breaking out of the loop print the sum of the numbers that have met all the conditions above
 */

public class WhileLoopChallenge {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i=1; i <= 1000; i++){
            if (i%3==0 && i%5==0){
                System.out.println(i);
                count++;
                sum += i;
            }
            if (count == 5){
                System.out.println("The sum of the first 5 numbers divisible by 3 and 5 is " + sum);
            break;
            }
        }
    }


}
