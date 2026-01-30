package interview_prgrams.Stringss;

import java.util.Arrays;

/**
 * Approach: Sorting-based Anagram Validation.
 * Time Complexity: O(n log n) due to Arrays.sort().
 * Space Complexity: O(n) to store the character arrays.
 */
public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        // 1. Pre-processing: Standardize inputs by removing whitespace and normalizing case.
        // This ensures "Listen" and "silent " are correctly identified as anagrams.
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // 2. Initial Optimization: If lengths differ, they cannot be anagrams (Short-circuit).
        if (s1.length() != s2.length()) {
            System.out.println(s1 + ", " + s2 + " are not anagrams (Length mismatch)");
        } else {
            // 3. Conversion: Transform strings to char arrays for sorting.
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();

            // 4. Sorting: Anagrams must have identical characters in the same frequency.
            // Sorting brings identical characters to the same index.
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            // 5. Comparison: Use Arrays.equals to check if the sorted patterns match.
            if (Arrays.equals(ch1, ch2)) {
                System.out.println(s1 + ", " + s2 + " are anagrams");
            } else {
                System.out.println(s1 + ", " + s2 + " are not anagrams");
            }
        }
    }
}