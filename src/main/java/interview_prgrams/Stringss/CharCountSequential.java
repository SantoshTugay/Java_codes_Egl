package interview_prgrams.Stringss;

public class CharCountSequential {
    public static void main(String[] args) {
        String str = "aabbaabbccd";

        int count = 1;

        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                System.out.println(str.charAt(i - 1) + "=" + count);
                count = 1;
            }
        }
    }
}

