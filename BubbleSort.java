/**
 * Sorting algorithm implementation
 * BubbleSort.
 * The pivot element is the first element in the partition.
 * Strings are evaluated by their length only.
 */

import java.util.Arrays;

public class BubbleSort {
    // sorting for int
    public static void sort(int[] array, boolean descending) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = array.length - 1; j > i; j--) {
                if ((!descending) && (array[j - 1] > array[j])) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                } else if ((descending) && (array[j - 1] < array[j])) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    // sorting for char
    public static void sort(char[] array, boolean descending) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = array.length - 1; j > i; j--) {
                if ((!descending) && (array[j - 1] > array[j])) {
                    char tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                } else if ((descending) && (array[j - 1] < array[j])) {
                    char tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    // sorting for String by their length
    public static void sort(String[] array, boolean descending) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = array.length - 1; j > i; j--) {
                if ((!descending) && (array[j - 1].length() > array[j].length())) {
                    String tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                } else if ((descending) && (array[j - 1].length() < array[j].length())) {
                    String tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
