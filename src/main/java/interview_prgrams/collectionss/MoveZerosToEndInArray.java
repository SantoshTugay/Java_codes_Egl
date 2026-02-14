package interview_prgrams.collectionss;

import java.util.Arrays;

public class MoveZerosToEndInArray {
    public static void main(String[] args) {
        int[] arr1 = {4, 0, 0, 3, 12};
        int idx = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != 0) {
                int temp = arr1[i];
                arr1[i] = arr1[idx];
                arr1[idx++] = temp;
            }

        } System.out.println(Arrays.toString(arr1));
    }
}