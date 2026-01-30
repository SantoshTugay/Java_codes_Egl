package interview_prgrams.java.JavaSamples;

public class NeonNumber {

    public static void main(String args[]) {

        int num = 9;
        int sum = 0;
        int square = num * num;

        // Loop to calculate the sum of the digits of the square
        while (square > 0) {
            // Get the last digit of the square
            int rem = square % 10;
            sum = sum+rem;
            square = square/10;
        }

        // Check if the sum of the digits is equal to the original number
        if (sum == num) {
            System.out.println("Number is Neon");
        } else {
            System.out.println("Number is not a Neon");
        }
    }
}