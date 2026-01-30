package interview_prgrams.collectionss;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        // Original list with duplicates
        List<Integer> list = Arrays.asList(10, 20, 30, 10, 20);

        // --- APPROACH 1: Using a Frequency Map (Imperative) ---
        // This counts how many times each number appears.
        Map<Integer, Integer> countMap = new HashMap<>();
        for (Integer s : list) {
            // If the key exists, increment; otherwise, start at 1
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        }
        System.out.println("Frequency Map: " + countMap);


        // --- APPROACH 2: Using a HashSet ---
        // Quickest way to get unique values, but note:
        // HashSet DOES NOT guarantee the original order.
        Set<Integer> uniqueIds = new HashSet<>(list);


        // --- APPROACH 3: Brute Force (Preserving Order) ---
        // We manually check if the 'res' list already has the item.
        // Time Complexity: O(n^2) because .contains() scans the list every time.
        List<Integer> res = new ArrayList<>();
        for (Integer i : list) {
            if (!res.contains(i)) {
                res.add(i);
            }
        }


        // --- APPROACH 4: Java Streams (Modern & Clean) ---
        // .distinct() uses a stateful filter to keep only the first occurrence.
        // This is the industry standard for Java 8+.
        List<Integer> unique = list.stream()
                .distinct()
                .collect(Collectors.toList());


        // --- APPROACH 5: GroupingBy (Stream API Counting) ---
        // Similar to Approach 1, but using a functional style.
        // Returns a Map where the value is a Long (count).
        Map<Integer, Long> uniqueCount = list.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        // --- FINAL OUTPUT ---
        System.out.println("--- Results ---");
        System.out.println("Set (Unordered):         " + uniqueIds);
        System.out.println("Brute Force (Ordered):   " + res);
        System.out.println("Stream Distinct:         " + unique);
        System.out.println("Stream Grouping Count:   " + uniqueCount);
    }
}