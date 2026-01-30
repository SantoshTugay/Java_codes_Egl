package interview_prgrams.Stringss;

import java.util.HashSet;
import java.util.Set;

public class StringPairs {

    public static void main(String[] args) {

        String str = "aabab";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
            //    if (str.charAt(i) == str.charAt(j)) {
                if (str.charAt(i) != str.charAt(j)) {
                    System.out.println("(" + str.charAt(i) + ", " + str.charAt(j) + ")");
                    count++;
                }
            }
        }

        System.out.println("Total matching pairs = " + count);

        // -----------------------------
        // Find repeated characters
        // -----------------------------
        Set<Character> seen = new HashSet<>();
        Set<Character> repeats = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!seen.add(ch)) {
                repeats.add(ch);
            }
        }

        System.out.println("Repeated characters: " + repeats);
    }
}
