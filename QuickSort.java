/**
 * Sorting algorithm implementation
 * Quicksort.
 * The pivot element is the first element in the partition.
 * Strings are evaluated by their length only.
 */

import java.util.Arrays;

public class QuickSort {

    //a simple swap function
    static void swap(int[] array, int low, int pivot) {

        int tmp = array[low];
        array[low] = array[pivot];
        array[pivot] = tmp;
    }

    static void swap(char[] array, int low, int pivot) {

        char tmp = array[low];
        array[low] = array[pivot];
        array[pivot] = tmp;
    }

    static void swap(String[] array, int low, int pivot) {

        String tmp = array[low];
        array[low] = array[pivot];
        array[pivot] = tmp;
    }

    // finding the partition element's index
    static int partition(int[] array, int low, int high, boolean descending) {
        int p = low, i;

        for (i = low + 1; i <= high; i++)
            if ((!descending) && (array[i] < array[low]))
                swap(array, ++p, i);
            else if ((descending) && (array[i] > array[low]))
                swap(array, ++p, i);

        swap(array, low, p);
        return p;
    }

    static int partition(char[] array, int low, int high, boolean descending) {
        int p = low, i;

        for (i = low + 1; i <= high; i++)
            if ((!descending) && (array[i] < array[low]))
                swap(array, ++p, i);
            else if ((descending) && (array[i] > array[low]))
                swap(array, ++p, i);

        swap(array, low, p);

        return p;
    }

    // finding the partition element's index for string array
    static int partition(String[] array, int low, int high, boolean descending) {
        int p = low, i;

        for (i = low + 1; i <= high; i++)
            if ((!descending) && (array[i].length() < array[low].length()))
                swap(array, ++p, i);
            else if ((descending) && (array[i].length() > array[low].length()))
                swap(array, ++p, i);

        swap(array, low, p);

        return p;
    }

    //It splits the array and  works recursively
    static void sort(int[] array, int low, int high, boolean descending) {

        if (low < high) {
            int p = partition(array, low, high, descending);
            sort(array, low, p - 1, descending);
            sort(array, p + 1, high, descending);
        }
    }

    static void sort(char[] array, int low, int high, boolean descending) {
        if (low < high) {
            int p = partition(array, low, high, descending);
            sort(array, low, p - 1, descending);
            sort(array, p + 1, high, descending);
        }
    }

    static void sort(String[] array, int low, int high, boolean descending) {
        if (low < high) {
            int p = partition(array, low, high, descending);
            sort(array, low, p - 1, descending);
            sort(array, p + 1, high, descending);
        }
    }
}
