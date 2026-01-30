package interview_prgrams.GforG.Arrays;

public class MoveZerosToEndInArray {
        public static void moveZerosToEnd(int[] arr) {
            int n = arr.length;
            int j = 0; // Index of next non-zero element

            // Move non-zero elements forward
            for (int i = 0; i < n; i++) {
                if (arr[i] != 0) {
                    arr[j] = arr[i];
                    j++;
                }
            }

            // Fill remaining positions with zeros
            while (j < n) {
                arr[j] = 0;
                j++;
            }
        }

        // Example usage
        public static void main(String[] args) {
            int[] arr = {0, 1, 0, 3, 12};
            moveZerosToEnd(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            // Output: 1 3 12 0 0
        }
    }
