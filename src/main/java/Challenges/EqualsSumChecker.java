package Challenges;

public class EqualsSumChecker {
/*
Write a method hasEqualSum with 3 parameters of type int.

The method should return boolean and it needs to return true if the sum of the first and second parameter
is equal to the third parameter. Otherwise, return false.
 */

    public static boolean hasEqualSum(int sum1, int sum2, int sum3){
        if ((sum1 + sum2) == sum3){
            return true;
        } else {
            return false;
        }
    }
}
