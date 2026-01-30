package interview_prgrams.Stringss;

public class WordCount_ {
    public static void main(String[] args) {
        String str = "Automation a  testing with Java";
        // Split the string by one or more whitespace characters
        String[] words = str.trim().split("\\s+");
        System.out.println("Words: " + words.length);
    }
}