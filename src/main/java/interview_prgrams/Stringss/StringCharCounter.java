package interview_prgrams.Stringss;

import java.util.HashMap;

public class StringCharCounter {

    public static void main(String[] args) {
        String str = "azbbaabbccd";
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        System.out.println(charCount);
        // Result: {a=4, b=4, c=2, d=1}

        System.out.println("---------countConsecutiveFrequency---------------------------");

        String str1 = "azbbaabbccd";
        int count = 1;
        int length=str1.length();
        for (int i = 1; i <= length; i++) {
            // Check if current char is same as previous
            if (i < length && str1.charAt(i) == str1.charAt(i - 1)) {
                count++;
            } else {
                // Print when character changes or string ends
                System.out.println(str1.charAt(i - 1) + "=" + count);
                count = 1;
            }
        }
        // Result: a=2, b=2, a=2, b=2, c=2, d=1
    }
}
