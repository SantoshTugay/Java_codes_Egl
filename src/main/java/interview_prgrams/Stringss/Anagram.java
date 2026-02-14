package interview_prgrams.Stringss;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        // first way
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if (Arrays.equals(a1, a2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");

        // Another way

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int count1 = 0;
            int count2 = 0;
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) == ch)
                    count1++;
                if (s2.charAt(j) == ch)
                    count2++;
            }
            if (count1 != count2) {
                System.out.println("Not Anagram");
                return;
            }
        }

        System.out.println("Anagram");
    }
}