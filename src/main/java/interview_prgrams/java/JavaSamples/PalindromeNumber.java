package interview_prgrams.java.JavaSamples;

public class PalindromeNumber {

    public static void main(String[] args) {
        int num = 121;
        int revnum = 0;
        // Store the original number in a temporary variable
        int temp = num;

        while (num > 0) {
            int digit= num % 10;
            // Get the last digit of the number and add it to revnum
            revnum = revnum * 10 +digit;
            // Remove the last digit from the number
            num = num / 10;
        }

        // Check if the original number is equal to the reversed number
        if (temp == revnum) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is not Palindrome");
        }
    }
}