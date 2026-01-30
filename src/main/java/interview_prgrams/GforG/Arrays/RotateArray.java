package interview_prgrams.GforG.Arrays;

import org.testng.annotations.Test;

public class RotateArray {

    @Test
    public void rotateArray() {
        // Initialize the array and the number of positions to rotate
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int order = 2;


        // Print the original array
        System.out.println("Original array:");
        printArray(arr);

        // Rotate the array to the right by 'order' positions
        for (int i = 0; i < order; i++) {
            // Perform a single right rotation
            for (int j = arr.length - 1; j > 0; j--) {
                // Swap the current element with the previous one
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }

        // Print the rotated array
        System.out.println("Rotated array:");
        printArray(arr);
    }

    // Helper method to print the array
    private void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}