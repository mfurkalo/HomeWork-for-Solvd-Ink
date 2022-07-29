/**
 * Sorting algorithm implementation
 * BubbleSort.
 * The pivot element is the first element in the partition.
 * Strings are evaluated by their length only.
 */

import java.util.Arrays;

public class BubbleSort {
    // sorting for int
    public static void sort(int[] array, boolean isDescending) {
        for (int i = 0; i < array.length - 1; i++)
            for (int j = array.length - 1; j > i; j--)
                if ((!isDescending) && (array[j - 1] > array[j]))
                    QuickSort.swap(array, j - 1, j);
                else if ((isDescending) && (array[j - 1] < array[j]))
                    QuickSort.swap(array, j - 1, j);
    }

    // sorting for char
    public static void sort(char[] array, boolean isDescending) {
        for (int i = 0; i < array.length - 1; i++)
            for (int j = array.length - 1; j > i; j--)
                if ((!isDescending) && (array[j - 1] > array[j]))
                    QuickSort.swap(array, j - 1, j);
                else if ((isDescending) && (array[j - 1] < array[j]))
                    QuickSort.swap(array, j - 1, j);
    }

    // sorting for String by their length
    public static void sort(String[] array, boolean isDescending) {
        for (int i = 0; i < array.length - 1; i++)
            for (int j = array.length - 1; j > i; j--)
                if ((!isDescending) && (array[j - 1].length() > array[j].length()))
                    QuickSort.swap(array, j - 1, j);
                else if ((isDescending) && (array[j - 1].length() < array[j].length()))
                    QuickSort.swap(array, j - 1, j);
    }
}
