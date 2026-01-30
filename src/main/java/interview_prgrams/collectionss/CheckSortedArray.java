package interview_prgrams.collectionss;

import java.util.Arrays;

public class CheckSortedArray {
    public static void main(String[] args) {
        int arr[]={3,2,1};
        boolean isSorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Is array sorted ascending? " + isSorted);
    }
}
