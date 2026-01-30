package interview_prgrams.Stringss;

import java.util.HashMap;
import java.util.Map;

public class RepeatedSubstringsCount {

    public static void main(String[] args) {
        String input = "ababza";
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String sub = input.substring(i, j);
                map.put(sub, map.getOrDefault(sub, 0) + 1);
            }
        }
        System.out.println(map);

//       String longestRepeatedSubstring = "";
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//
//            if (entry.getValue() >= 1) {
//                System.out.println(entry.getKey() + " -> " + entry.getValue());
//                count++;
//            }
//
//            if (entry.getKey().length() > longestRepeatedSubstring.length()) {
//                longestRepeatedSubstring = entry.getKey();
//            }
//        }
//
//        System.out.println("Total repeated substrings = " + count);
//        System.out.println("Longest non-unique substring = " + longestRepeatedSubstring);
    }
}
