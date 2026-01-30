package interview_prgrams.Stringss;

public class SwapPairsInString {
    public static void main(String[] args) {
        String input = "abcder";
        char[] chars = input.toCharArray();
        System.out.println(chars);

        // Swap adjacent characters
        for (int i = 0; i < chars.length - 1; i += 2) {
            char temp = chars[i];
            chars[i] = chars[i + 1];
            chars[i + 1] = temp;
        }
        System.out.println(chars);
    }
}
