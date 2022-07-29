/**
 * Sorting algorithm implementation
 * Quicksort.
 * The pivot element is the first element in the partition.
 * Strings are evaluated by their length only.
 */

import java.util.Arrays;

public class QuickSort {

    //a simple swap function
    static <T> void swap(T[] array, int lowIndex, int pivotIndex) {
        T tmp = array[lowIndex];
        array[lowIndex] = array[pivotIndex];
        array[pivotIndex] = tmp;
    }

    static void swap(int[] array, int lowIndex, int pivotIndex) {
        int tmp = array[lowIndex];
        array[lowIndex] = array[pivotIndex];
        array[pivotIndex] = tmp;
    }

    static void swap(char[] array, int lowIndex, int pivotIndex) {
        char tmp = array[lowIndex];
        array[lowIndex] = array[pivotIndex];
        array[pivotIndex] = tmp;
    }

    // finding the partition element's index
    static int partition(int[] array, int lowIndex, int highIndex, boolean isDescending) {
        int p = lowIndex, i;
        for (i = lowIndex + 1; i <= highIndex; i++)
            if ((!isDescending) && (array[i] < array[lowIndex]))
                swap(array, ++p, i);
            else if ((isDescending) && (array[i] > array[lowIndex]))
                swap(array, ++p, i);
        swap(array, lowIndex, p);
        return p;
    }

    static int partition(char[] array, int lowIndex, int highIndex, boolean isDescending) {
        int p = lowIndex, i;
        for (i = lowIndex + 1; i <= highIndex; i++)
            if ((!isDescending) && (array[i] < array[lowIndex]))
                swap(array, ++p, i);
            else if ((isDescending) && (array[i] > array[lowIndex]))
                swap(array, ++p, i);
        swap(array, lowIndex, p);
        return p;
    }

    // finding the partition element's index for string array
    static int partition(String[] array, int lowIndex, int highIndex, boolean isDescending) {
        int p = lowIndex, i;
        for (i = lowIndex + 1; i <= highIndex; i++)
            if ((!isDescending) && (array[i].length() < array[lowIndex].length()))
                swap(array, ++p, i);
            else if ((isDescending) && (array[i].length() > array[lowIndex].length()))
                swap(array, ++p, i);
        swap(array, lowIndex, p);
        return p;
    }

    //It splits the array and  works recursively
    static void sort(int[] array, int lowIndex, int highIndex, boolean isDescending) {
        if (lowIndex < highIndex) {
            int p = partition(array, lowIndex, highIndex, isDescending);
            sort(array, lowIndex, p - 1, isDescending);
            sort(array, p + 1, highIndex, isDescending);
        }
    }

    static void sort(char[] array, int lowIndex, int highIndex, boolean isDescending) {
        if (lowIndex < highIndex) {
            int p = partition(array, lowIndex, highIndex, isDescending);
            sort(array, lowIndex, p - 1, isDescending);
            sort(array, p + 1, highIndex, isDescending);
        }
    }

    static void sort(String[] array, int lowIndex, int highIndex, boolean isDescending) {
        if (lowIndex < highIndex) {
            int p = partition(array, lowIndex, highIndex, isDescending);
            sort(array, lowIndex, p - 1, isDescending);
            sort(array, p + 1, highIndex, isDescending);
        }
    }
}