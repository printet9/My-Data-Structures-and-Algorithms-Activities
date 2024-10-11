import java.util.Scanner;

public class LinearSearch {
    // Function to perform linear search
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index if target is found
            }
        }
        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Initialize the array
        int[] array = new int[size];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Get the target value to search
        System.out.print("Enter the target value to search: ");
        int target = scanner.nextInt();

        // Perform linear search
        int result = linearSearch(array, target);

        // Output the result
        if (result != -1) {
            System.out.println("Target value found at index " + result);
        } else {
            System.out.println("Target value not found in the array.");
        }

        scanner.close();
    }
}