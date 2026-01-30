package interview_prgrams.java.JavaSamples;

public class ExtractAlphanumeric {
    public static void main(String[] args) {
        String input = "abcd1234%^&*";
        // Extract only letters and digits
        String result = input.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(result); // Output: abcd1234
    }
}