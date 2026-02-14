package interview_prgrams.Stringss.substringg;

import java.util.HashMap;
import java.util.Map;

public class RepeatedSubstringsCount {

    public static void main(String[] args) {

        String input = "abaaba";

        // =====================================================
        // 1️⃣ Generate All Substrings & Store Frequency
        // =====================================================

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String sub = input.substring(i, j);
                map.put(sub, map.getOrDefault(sub, 0) + 1);
            }
        }

        System.out.println("All Substring Frequencies:");
        System.out.println(map);

        // =====================================================
        // 2️⃣ Print Only Repeated Substrings
        // =====================================================

        System.out.println("\nRepeated Substrings:");
        int count = 0;
        String longestRepeatedSubstring = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {     // Correct condition
                System.out.println(entry.getKey() + " -> " + entry.getValue());
                count++;
                if (entry.getKey().length() > longestRepeatedSubstring.length()) {
                    longestRepeatedSubstring = entry.getKey();
                }
            }
        }

        // =====================================================
        // 3️⃣ Final Results
        // =====================================================

        System.out.println("\nTotal repeated substrings = " + count);
        System.out.println("Longest repeated substring = " + longestRepeatedSubstring);
    }
}
