package interview_prgrams.Stringss.duplicate;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateChars {

    // ── Approach 1 : Brute Force ──────────────────────────────────────────
    public static String bruteForce(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result += input.charAt(i);
            }
        }
        return result;
    }

    // ── Approach 2 : Boolean Array ────────────────────────────────────────
    public static String booleanArray(String input) {
        boolean[] seen = new boolean[256];
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                result.append(c);
            }
        }
        return result.toString();
    }

    // ── Approach 3 : LinkedHashSet ────────────────────────────────────────
    public static String linkedHashSet(String input) {
        LinkedHashSet<Character> seen = new LinkedHashSet<>();
        for (char c : input.toCharArray()) {
            seen.add(c);
        }
        StringBuilder result = new StringBuilder();
        for (char c : seen) {
            result.append(c);
        }
        return result.toString();
    }

    // ── Approach 4 : HashMap getOrDefault ────────────────────────────────
    public static String hashMapGetOrDefault(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (frequencyMap.get(c) != null) {
                result.append(c);
                frequencyMap.remove(c);
            }
        }
        return result.toString();
    }

    // ── Approach 5 : Java Streams ─────────────────────────────────────────
    public static String streams(String input) {
        return input.chars()
                .distinct()
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }

    // ── Main ──────────────────────────────────────────────────────────────
    public static void main(String[] args) {
        String input = "abcabc";

        System.out.println("Input : " + input);
        System.out.println("─────────────────────────────────────");

        System.out.println("1. Brute Force          : " + bruteForce(input));
        System.out.println("2. Boolean Array        : " + booleanArray(input));
        System.out.println("3. LinkedHashSet        : " + linkedHashSet(input));
        System.out.println("4. HashMap getOrDefault : " + hashMapGetOrDefault(input));
        System.out.println("5. Streams              : " + streams(input));
    }
}
