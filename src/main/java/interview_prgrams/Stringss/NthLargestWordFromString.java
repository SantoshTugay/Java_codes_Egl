package interview_prgrams.Stringss;

public class NthLargestWordFromString {
    public static void main(String[] args) {
        String str = "ab abc a abcd";
        int n = 4;
        String[] words = str.split(" ");

        // Check if n is valid
        if (n <= 0 || n > words.length) {
            System.out.println("Invalid value of n: " + n);
            return; // Exit the program
        }
        // Sort words by length (longest first)
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                // below gives the Nth largest word and if you use < you will get small one
                if (words[i].length() > words[j].length()) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        System.out.println(n + "nd largest word: " + words[n - 1]);
    }
}
