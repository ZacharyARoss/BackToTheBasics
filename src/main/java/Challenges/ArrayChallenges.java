package Challenges;

import java.util.Arrays;
import java.util.Random;

/*
Create a program using arrays, that sorts a list of integers, in descending order.
First create an array of randomly generated integers
print the array before you sort it
print the array after you sort it
You can choose to create a new sorted array, or just sort the current array
 */
public class ArrayChallenges {
    public static void main(String[] args) {

    int[] unsortedArray = getRandomArray(10);
        System.out.println(Arrays.toString(unsortedArray));

    int[] sortedArray = sortIntegers(unsortedArray);
        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] sortIntegers(int[] arrayIWantToSort){

        int[] sortedArray = Arrays.copyOf(arrayIWantToSort, arrayIWantToSort.length);
        boolean flag = true;
        int temporary;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray [i+1]) {
                    temporary = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temporary;
                    flag = true;
                }
            }
        }

        return sortedArray;
        }
    public static int[] getRandomArray(int len){

        Random random = new Random();
        int[] randomArray = new int[len];
        for (int i = 0; i < len; i++){
            randomArray[i] = random.nextInt(1000);
        }
        return randomArray;
    }
}



