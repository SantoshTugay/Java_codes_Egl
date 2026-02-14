package interview_prgrams.Stringss.duplicate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsFromString {

    public static void main(String[] args) {
        String str = "engineering";

        // =====================================================
        // 1️⃣ Nested Loop Approach (O(n²))
        // =====================================================

        System.out.println("---- Nested Loop Approach ----");
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '0')
                continue;
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = '0';   // mark visited
                }
            }
            if (count > 1) {
                System.out.println(arr[i] + " : " + count);
            }
        }

        // =====================================================
        // 2️⃣ HashMap Frequency Approach (O(n))
        // =====================================================

        System.out.println("\n---- HashMap Frequency Approach ----");
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

        // =====================================================
        // 3️⃣ HashSet Approach (Repeated Characters Only)
        // =====================================================

        System.out.println("\n---- HashSet Repeated Characters ----");
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
