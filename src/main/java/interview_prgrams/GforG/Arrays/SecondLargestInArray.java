package interview_prgrams.GforG.Arrays;

public class SecondLargestInArray {
    // This code can be used for first, second and third largest no from an array.
    public static void main(String args[]) {
        int arr[] = {1, 2, 4, 6, 8};

        int n = arr.length;
        int largest = -1;
        int secondLargest = -1;
        int thirdLargest = -1;


        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            }

            // If arr[i] is greater than third,
            // set third to arr[i].
            else if (arr[i] > thirdLargest) {
                thirdLargest = arr[i];
            }
        }

        System.out.println(largest+" "+secondLargest+" "+thirdLargest);
}
}
