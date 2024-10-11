import java.util.Scanner;

public class InsertionSort {
    
    // Method to perform insertion sort
    public static void insertionSort(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int s = j - 1;

            // Move elements greater than key to one position ahead
            while (s >= 0 && arr[s] > key) {
                arr[s + 1] = arr[s];
                s--;
            }
            arr[s + 1] = key;

            // Print the array after each insertion
            System.out.print("After inserting " + key + ": ");
            printArray(arr);
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the size of the array
        System.out.print("Enter the number of elements you want to sort: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Input elements from the user
        System.out.println("Enter " + n + " integers:");
        for (int j = 0; j < n; j++) {
            arr[j] = scanner.nextInt();
        }

        System.out.println("Original array:");
        printArray(arr);

        // Perform insertion sort
        insertionSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);

        scanner.close();
    }
}