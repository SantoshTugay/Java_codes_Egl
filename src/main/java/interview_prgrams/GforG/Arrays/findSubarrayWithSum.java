package interview_prgrams.GforG.Arrays;

import java.util.*;

public class findSubarrayWithSum {

    public static List<Integer> findSubarrayWithSumBruteForce(int[] arr, int target) {
        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];
                if (sum == target) {
                    List<Integer> result = new ArrayList<>();
                    for (int i = start; i <= end; i++) {
                        result.add(arr[i]);
                    }
                    return result;
                }
            }
        }
        return Collections.emptyList();
    }

    // Example usage:
    public static void main(String[] args) {
        int[] arr = {12, 5, 31, 9, 21, 8};
        int target = 45;
        List<Integer> subarray = findSubarrayWithSumBruteForce(arr, target);
        System.out.println(subarray); // Output: [5, 31, 9]
    }

}