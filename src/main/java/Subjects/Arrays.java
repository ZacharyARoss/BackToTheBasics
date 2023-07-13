package Subjects;

public class Arrays {
    public static void main(String[] args) {

        int [] myIntArray = new int[10];
        myIntArray[0] = 12;
        myIntArray[1] = 23;
        myIntArray[2] = 11;
        myIntArray[3] = 50;
        myIntArray[4] = 45;
        myIntArray[5] = 34;
        myIntArray[6] = 45;
        myIntArray[7] = 56;
        myIntArray[8] = 67;
        myIntArray[9] = 78;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " +  firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of the array = " + arrayLength);

        //print out element of an array using for each loop

        for (int element : myIntArray){
            System.out.println(element + " ");
        }
    }
}
