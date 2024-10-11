import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    // Method to perform merge sort on an integer array
    public static void mergeSort(int[] array) {
        // Base case: If the array has only one element or is empty, it's already sorted
        if (array.length > 1) {
            // Find the middle index of the array
            int mid = array.length / 2;

            // Create two subarrays: leftArray and rightArray
            int[] leftArray = Arrays.copyOfRange(array, 0, mid); // Elements from index 0 to mid (exclusive)
            int[] rightArray = Arrays.copyOfRange(array, mid, array.length); // Elements from mid to the end

            // Recursively sort the left and right subarrays
            mergeSort(leftArray);
            mergeSort(rightArray);

            // Merge the sorted leftArray and rightArray back into the original array
            merge(array, leftArray, rightArray);
        }
    }

    // Method to merge two sorted arrays into a single sorted array
    private static void merge(int[] array, int[] leftArray, int[] rightArray) {
        // Initialize indices for iterating through the arrays
        int i = 0, j = 0, k = 0;

        // Compare elements from leftArray and rightArray and copy the smaller one to array
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++; // Move to the next element in leftArray
            } else {
                array[k] = rightArray[j];
                j++; // Move to the next element in rightArray
            }
            k++; // Move to the next position in array
        }

        // Copy any remaining elements from leftArray to array
        while (i < leftArray.length) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy any remaining elements from rightArray to array
        while (j < rightArray.length) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] data = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextInt();
        }

        System.out.println("Unsorted Array:");
        System.out.println(Arrays.toString(data));

        mergeSort(data);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(data));
    }
}
