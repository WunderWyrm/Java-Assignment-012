/**
 *
 * @author Trevor Hartman
 * @author Samuel Theiss
 *
 * @since Version 1.0
 *
 */

import java.util.Arrays;

public class SortingAlgorithms {

    public static void swapElements(int[] array, int index1, int index2) {

        int temp = array[index1];

        array[index1] = array[index2];
        array[index2] = temp;

    }

    public static int[] selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int lowest = i;

            for (int y = i+1; y < array.length; y++) {

                if (array[y] < array[lowest]) {
                    lowest = y;
                }

            }

            swapElements(array, i, lowest);

        }

        return array;

    }


    public static void main(String[] args) {

        int[] testArray = new int[] {5,10,4,7,2,7,4,6,2,8,2,7,4,9,3};

        System.out.println( Arrays.toString(testArray) + " " + Arrays.toString(selectionSort(testArray)) );

    }

}
