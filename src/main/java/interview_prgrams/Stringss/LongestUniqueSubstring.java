package interview_prgrams.Stringss;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String s = "abac";
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                Set<Character> set = new HashSet<>();
                boolean isUnique = true;
                    for (char c : sub.toCharArray()) {
                    if (!set.add(c)) {
                        isUnique = false;
                        break;
                        }
                    }

                if (isUnique) {
                    max = Math.max(max, sub.length());

                }
                System.out.println(set);
            }
        }

        System.out.println(max);
    }
}
