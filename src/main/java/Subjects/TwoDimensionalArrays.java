package Subjects;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] array2D = new int[4][4];
        System.out.println(Arrays.toString(array2D));
        System.out.println("array2d.length = " + array2D.length);

        for (int[] outer : array2D) {
            System.out.println(Arrays.toString(outer));
        }

        for (int i = 0; i < array2D.length; i++) {
            var innerArray = array2D[i];
            for (int j = 0; j < innerArray.length; j++){
                //System.out.println(array2D[i][j] + " ");
                array2D[i][j] = (i * 10) + (j +1);
            }
            System.out.println();
        }

//        for (var outer : array2D){
//            for (var element : outer){
//                System.out.println(element + " ");
//            }
//            System.out.println();
//        }
        System.out.println(Arrays.deepToString(array2D));
    }
}
