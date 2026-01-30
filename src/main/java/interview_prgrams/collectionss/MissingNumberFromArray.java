package interview_prgrams.collectionss;

public class MissingNumberFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4};
        int n = 4; // Range is 1 to 8
        int expectedSum = n * (n + 1) / 2;
// Calculate actual sum of array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
// Missing number is the difference
        int res = expectedSum - actualSum;
        System.out.println(res);
    }
}
