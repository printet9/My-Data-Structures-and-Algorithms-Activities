import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = {7, 5, 3, 6, 1, 2};
        
        //Print the unsorted array
        System.out.println("Unsorted Array:");
        System.out.println(Arrays.toString(data));

        selectionSort(data);
        //Print the sorted array
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(data));
    }
}
