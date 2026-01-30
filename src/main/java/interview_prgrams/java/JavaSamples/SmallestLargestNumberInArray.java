package interview_prgrams.java.JavaSamples;

public class SmallestLargestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {10, 13, 50, 40};
        if (arr.length == 0) {
            System.out.println("Enter an array having some data");
        }
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Largest number: " + max + " Smallest number: " + min);
    }
}
