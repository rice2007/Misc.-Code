package algorithms;

import java.util.Scanner;

/**
 * Aaron Rice
 * rice2007
 * Misc. Code
 */
public class Test {

    public static void linearSearch(int[] array, int key) {
        insertionSort(array);
        boolean foundFlag = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                System.out.println(Integer.toString(key) + " is at index "
                        + Integer.toString(i) + ".");
                foundFlag = true;
            }
        }
        if (!foundFlag) System.out.println("The entered value was not found.");
        return;
    }

    public static void binarySearch(int[] array) {
        insertionSort(array);
    }

    private static int[] insertionSort(int[] array) {
        int key;
        int i;
        for (int j = 1; j < array.length; j++) { //array.length = n
            key = array[j];
            i = j - 1;
            while(i >= 0 && array[i] > key) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + ","); //Prints sorted array. Hanging comma for debugging.
        }
        System.out.println();
        return array;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = 32;
        int[] array = new int[n];
        int key = Integer.parseInt(scan.next());
        for (int i = 0; i < array.length; i++) { //Prints the unsorted array
            array[i] = (int) (Math.random() * n + 1);
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            }
            else System.out.println(i);
        }
        linearSearch(array, key);
        scan.close();
    }

}
