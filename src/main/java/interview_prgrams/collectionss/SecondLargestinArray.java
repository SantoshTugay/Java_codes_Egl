package interview_prgrams.collectionss;

public class SecondLargestinArray {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 34};

        if (arr.length < 2) {
            System.out.println("Array must have at least two elements");
            return;
        }

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if (largest == secondLargest) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second Largest: " + secondLargest);
        }
    }
}