package interview_prgrams.java.JavaSamples;

public class Armstrong {
    public static void main(String[] args) {
        // Define the number to check
        int armnum = 370;

        // Variables to use in calculations

        int temp;
        int total = 0;

        // Copy the original number to another variable
        int num = armnum;

        // Loop to calculate the sum of the cubes of its digits
        while (num != 0) {
            // Get the last digit of the number
            temp = num % 10;

            // Add the cube of the digit to the total
            total = total + temp * temp * temp;

            // Remove the last digit from the number
            num = num / 10;
        }

        // Check if the sum of the cubes is equal to the original number
        if (total == armnum) {
            System.out.println(armnum + " is an Armstrong number");
        } else {
            System.out.println(armnum + " is not an Armstrong number");
        }
    }
}