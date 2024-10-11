	import java.util.Arrays;
    import java.util.Scanner;
    
public class QuickSort {

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // pi is partitioning index, array[p] is now at right place 
            int pi = partition(array, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        // choose the rightmost element as pivot
        int pivot = array[high];

        // pointer for greater element
        int i = (low - 1);

        // traverse through all elements
        // compare each element with pivot
        for (int j = low; j <= high - 1; j++) {
            if (array[j] <= pivot) {
                // If element smaller than pivot is found
                // swap it with the greater element pointed by i
                i++;

                // Swapping element at i with element at j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap the pivot element with the greater element specified by i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Return the position from where partition is done
        return i + 1;
    }

    public static void main(String[] args) {
        int[] data = {5, 2, 4, 6, 1, 3};

        System.out.println("Unsorted Array:");
        System.out.println(Arrays.toString(data));

        quickSort(data, 0, data.length - 1);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(data));
    }
}
