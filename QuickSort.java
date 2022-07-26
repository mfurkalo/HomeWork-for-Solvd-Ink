/**
 * Sorting algorithm implementation
 * Quicksort.
 * The pivot element is the first element in the partition.
 */

import java.util.Arrays;

public class QuickSort {
    static int[] array = {4, 58, 14, 69, 2, 0, 89, 55, 11, 8, 3, 8, 5, 4, 16, 8, 78, 0, -25, -8, 32};

    public static void main(String[] args) {

        System.out.println("Let's sort this array: " + Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println("The array is sorted now: " + Arrays.toString(array));
    }

    //a simple swap function
    static void swap(int[] array, int low, int pivot) {

        array[low] = array[low] + array[pivot];
        array[pivot] = array[low] - array[pivot];
        array[low] = array[low] - array[pivot];
    }

    // finding the partition element's index
    static int partition(int[] array, int low, int high) {
        int p = low, i;

        for (i = low + 1; i <= high; i++)
            if (array[i] < array[low])
                swap(array, ++p, i);

        swap(array, low, p);
        return p;
    }

    //It splits the array and  works recursively
    static void quickSort(int[] array, int low, int high) {

        if (low < high) {
            int p = partition(array, low, high);
            quickSort(array, low, p - 1);
            quickSort(array, p + 1, high);
        }
    }
}
