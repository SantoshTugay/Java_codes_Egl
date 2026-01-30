package interview_prgrams.java.JavaSamples;
import java.util.HashSet;
import java.util.Set;

public class ArrayElementCheck {

    public static void main(String[] args) {
        // Initialize the arrays
        Integer[] a1 = {1, 2, 3, 4};
        Integer[] a2 = {4, 3, 2, 1, 5, 6};

        // Check if all elements of a1 are in a2
        boolean result = areAllElementsPresent(a1, a2);
        System.out.println("All elements of a1 are present in a2: " + result);

        // Example with a different array
        Integer[] a3 = {1, 2, 4, 7};
        boolean result2 = areAllElementsPresent(a3, a2);
        System.out.println("All elements of a3 are present in a2: " + result2);
    }

    // Method to check if all elements of array1 are present in array2
    public static boolean areAllElementsPresent(Integer[] array1, Integer[] array2) {
        // Convert array2 to a set for efficient lookup
        Set<Integer> set = new HashSet<>();
        for (Integer num : array2) {
            set.add(num);
        }

        // Check each element in array1
        for (Integer num : array1) {
            if (!set.contains(num)) {
                return false; // If any element is not found, return false
            }
        }

        return true; // All elements are found
    }
}