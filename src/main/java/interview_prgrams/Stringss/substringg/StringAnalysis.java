package interview_prgrams.Stringss.substringg;

import java.util.HashSet;
import java.util.Set;

public class StringAnalysis {

    public static void main(String[] args) {

        String str = "aabab";
        int n = str.length();

        // -----------------------------------------
        // 1️⃣ Character Pairs (Non-contiguous)
        // -----------------------------------------
        int pairCount = 0;
        System.out.println("Character Pairs:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println("(" + str.charAt(i) + ", " + str.charAt(j) + ")");
                pairCount++;
            }
        }
        System.out.println("Total character pairs = " + pairCount);
        System.out.println("Formula n(n-1)/2 = " + (n*(n-1)/2));

        // -----------------------------------------
        // 2️⃣ All Substrings (Contiguous)
        // -----------------------------------------
        int subCount = 0;
        System.out.println("\nSubstrings:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.println(str.substring(i, j));
                subCount++;
            }
        }
        System.out.println("Total substrings = " + subCount);
        System.out.println("Formula n(n+1)/2 = " + (n*(n+1)/2));

        // -----------------------------------------
        // 3️⃣ Repeated Characters
        // -----------------------------------------
        Set<Character> seen = new HashSet<>();
        Set<Character> repeated = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!seen.add(ch)) {
                repeated.add(ch);
            }
        }
        System.out.println("\nRepeated Characters: " + repeated);

        // -----------------------------------------
        // 4️⃣ Adjacent Pairs (Sliding Window Size 2)
        // -----------------------------------------
        System.out.println("\nAdjacent Pairs:");
        for (int i = 0; i < n - 1; i++) {
            System.out.println(str.charAt(i) + "" + str.charAt(i + 1));
        }
    }
}
