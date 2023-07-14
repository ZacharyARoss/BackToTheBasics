package Challenges;

/*
Write a method called reverse, that takes an int array as a parameter
in the main method, call the reverse method, and print the array both before and after the reverse method is called
[1,2,3,4,5] should read [5,4,3,2,1]
 */
public class ArrayChallengeReverseArray {
    public static void main(String[] args) {
    }
    public static int[] reverse(int[] array) {

        int maxIndex = array.length - 1;
        int halfIndex = array.length / 2;

        for (int i = 0; i < halfIndex; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - 1];
            array[maxIndex - 1] = temp;
        }
        return null;
    }

}

