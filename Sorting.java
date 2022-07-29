import java.util.Arrays;

public class Sorting {
    static int[] array = {4, 58, 14, 69, 2, 0, 89, 55, 11, 8, 3, 8, 5, 4, 16, 8, 78, 0, -25, -8, 32};
    static char[] arrayChar = {' ', 'g', '-', 'b', 'g', 'A', 'a', 'c', 'G', 'Y'};
    static String[] arrayString = {"string", "str", "1", "String", "2 times", "A long string"};

    public static void main(String[] args) {
        System.out.println("Sorting by by QuickSort");
        System.out.println("Let's sort ascending this int array: " + Arrays.toString(array));
        QuickSort.sort(array, 0, array.length - 1, false);
        System.out.println("The array is sorted now: " + Arrays.toString(array));

        System.out.println("Let's sort descending  the int array");
        QuickSort.sort(array, 0, array.length - 1, true);
        System.out.println("The array is sorted now: " + Arrays.toString(array));

        System.out.println("Let's sort ascending this char array: " + Arrays.toString(arrayChar));
        QuickSort.sort(arrayChar, 0, arrayChar.length - 1, false);
        System.out.println("The array is sorted now: " + Arrays.toString(arrayChar));

        System.out.println("Let's sort descending  the char array");
        QuickSort.sort(arrayChar, 0, arrayChar.length - 1, true);
        System.out.println("The array is sorted now: " + Arrays.toString(arrayChar));

        System.out.println("Let's sort ascending this string array: " + Arrays.toString(arrayString));
        QuickSort.sort(arrayString, 0, arrayString.length - 1, false);
        System.out.println("The array is sorted now: " + Arrays.toString(arrayString));

        System.out.println("Let's sort descending the string array");
        QuickSort.sort(arrayString, 0, arrayString.length - 1, true);
        System.out.println("The array is sorted now: " + Arrays.toString(arrayString));

        System.out.println('\n'+"Sorting by by BubbleSort");
        System.out.println("Let's sort ascending this int array: " + Arrays.toString(array));
        BubbleSort.sort(array, false);
        System.out.println("The array is sorted now: " + Arrays.toString(array));

        System.out.println("Let's sort descending  the int array");
        BubbleSort.sort(array, true);
        System.out.println("The array is sorted now: " + Arrays.toString(array));

        System.out.println("Let's sort ascending this char array: " + Arrays.toString(arrayChar));
        BubbleSort.sort(arrayChar, false);
        System.out.println("The array is sorted now: " + Arrays.toString(arrayChar));

        System.out.println("Let's sort descending  the char array");
        BubbleSort.sort(arrayChar, true);
        System.out.println("The array is sorted now: " + Arrays.toString(arrayChar));

        System.out.println("Let's sort ascending this string array: " + Arrays.toString(arrayString));
        BubbleSort.sort(arrayString, false);
        System.out.println("The array is sorted now: " + Arrays.toString(arrayString));

        System.out.println("Let's sort descending the string array");
        BubbleSort.sort(arrayString, true);
        System.out.println("The array is sorted now: " + Arrays.toString(arrayString));
    }
}
