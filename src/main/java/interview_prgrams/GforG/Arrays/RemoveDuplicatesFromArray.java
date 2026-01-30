package interview_prgrams.GforG.Arrays;

import java.util.HashSet;

public class RemoveDuplicatesFromArray {

    /*int[] arr = {1, 2, 2, 3, 4, 4};
    HashSet<Integer> set = new HashSet<>();
    for (int n : arr) set.add(n);
    System.out.println(set);
    */
    public static void main(String args[]) {
        int arr[] = {1, 2, 2, 1, 1, 3, 3, 4, 4, 4,0};

        // HashSet to store unique elements
        HashSet<Integer> hs = new HashSet<>();

        // Print array without duplicates and preserve order
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < arr.length; i++) {
            if (!hs.contains(arr[i])) {
                System.out.print(arr[i] + " ");
                hs.add(arr[i]);
            }
        }

        System.out.print(" \n Array after removing duplicates: ");
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            // Check if arr[i] has appeared before in arr[0...i-1]
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
