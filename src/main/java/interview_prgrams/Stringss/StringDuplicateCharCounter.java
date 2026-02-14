package interview_prgrams.Stringss;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringDuplicateCharCounter {

    public static void main(String[] args) {

        String str = "abbcabc";

        // ------------------------------------
        // 1️⃣ Global Frequency Count
        // ------------------------------------
        Map<Character, Integer> charCount = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        System.out.println("Global Frequency: " + charCount);

        // ------------------------------------
        // 2️⃣ Consecutive Frequency Count
        // ------------------------------------
        System.out.println("Consecutive Frequency:");
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                System.out.println(str.charAt(i - 1) + " = " + count);
                count = 1;
            }
        }
        // Important: Print last character group
        System.out.println(str.charAt(str.length() - 1) + " = " + count);

        // ------------------------------------
        // 3️⃣ Repeated Characters Only
        // ------------------------------------
        Set<Character> seen = new HashSet<>();
        Set<Character> repeated = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!seen.add(ch)) {
                repeated.add(ch);
            }
        }

        System.out.println("Repeated Characters: " + repeated);
    }
}
