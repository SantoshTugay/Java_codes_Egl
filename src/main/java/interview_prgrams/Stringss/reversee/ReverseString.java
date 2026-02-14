package interview_prgrams.Stringss.reversee;

import java.util.stream.Stream;

public class ReverseString {

    public static void main(String[] args) {
        String s = "this is epam systems";
        String reverseString = "";
        char ch;

        // =====================================================
        // 1️⃣ Reverse using simple loop (prepend method)
        // =====================================================

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            reverseString = ch + reverseString;
        }
        System.out.println("Reversed string: " + reverseString);

        // =====================================================
        // 2️⃣ Reverse using backward iteration
        // =====================================================

        for (int i = s.length() - 1; i > 0; i--) {
            reverseString = reverseString + s.charAt(i);
        }
        System.out.println("Reversed string: " + reverseString);

        // =====================================================
        // 3️⃣ Reverse using StringBuilder (Recommended)
        // =====================================================

        String result = new StringBuilder("Santosh").reverse().toString();
        System.out.println("Reversed string: " + result);

        // =====================================================
        // 4️⃣ Reverse using Java 8 Stream
        // =====================================================

        String reversed = Stream.of(s.split(""))
                .reduce("", (reversedString, character) -> character + reversedString);
        System.out.println("Reversed: " + reversed);
    }
}
