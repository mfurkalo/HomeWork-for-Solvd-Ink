/**
 * Sorting algorithm implementation
 * Quicksort.
 * The pivot element is the first element in the partition.
 * Strings are evaluated by their length only.
 */

import java.util.Arrays;

public class QuickSort {
    static int[] array = {4, 58, 14, 69, 2, 0, 89, 55, 11, 8, 3, 8, 5, 4, 16, 8, 78, 0, -25, -8, 32};
    static char[] arrayChar ={' ','g','-','b','g','A','a','c', 'G', 'Y'};

    static  String[] arrayString ={"string", "str", "1", "String", "2 times", "A long string"};



    public static void main(String[] args) {

        System.out.println("Let's sort ascending this int array: " + Arrays.toString(array));
        quickSort(array, 0, array.length - 1, false);
        System.out.println("The array is sorted now: " + Arrays.toString(array));
        System.out.println("Let's sort descending  the int array");
        quickSort(array, 0, array.length - 1, true);
        System.out.println("The array is sorted now: " + Arrays.toString(array));

        System.out.println("Let's sort ascending this char array: " + Arrays.toString(arrayChar));
        quickSort(arrayChar, 0, arrayChar.length - 1, false);
        System.out.println("The array is sorted now: " + Arrays.toString(arrayChar));

        System.out.println("Let's sort descending  the char array");
        quickSort(arrayChar, 0, arrayChar.length - 1, true);
        System.out.println("The array is sorted now: " + Arrays.toString(arrayChar));

        System.out.println("Let's sort ascending this string array: " + Arrays.toString(arrayString));
        quickSort(arrayString, 0, arrayString.length - 1, false);
        System.out.println("The array is sorted now: " + Arrays.toString(arrayString));

        System.out.println("Let's sort descending this string array: " + Arrays.toString(arrayString));
        quickSort(arrayString, 0, arrayString.length - 1, true);
        System.out.println("The array is sorted now: " + Arrays.toString(arrayString));
    }

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

    static int  partition(char[] array, int low, int high, boolean descending){
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
    static int  partition(String[] array, int low, int high, boolean descending){
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
    static void quickSort(int[] array, int low, int high, boolean descending) {

        if (low < high) {
            int p = partition(array, low, high, descending);
            quickSort(array, low, p - 1, descending);
            quickSort(array, p + 1, high, descending);
        }
    }

    static void quickSort(char[] array, int low, int high, boolean descending) {
        if (low < high) {
            int p = partition(array, low, high, descending);
            quickSort(array, low, p - 1, descending);
            quickSort(array, p + 1, high, descending);
        }
    }

    static void quickSort(String[] array, int low, int high, boolean descending) {
        if (low < high) {
            int p = partition(array, low, high, descending);
            quickSort(array, low, p - 1, descending);
            quickSort(array, p + 1, high, descending);
        }
    }

}
