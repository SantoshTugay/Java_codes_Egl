package interview_prgrams.GforG.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 5};

        System.out.print("Reversed array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // For a clean line break at the end
    }
}
