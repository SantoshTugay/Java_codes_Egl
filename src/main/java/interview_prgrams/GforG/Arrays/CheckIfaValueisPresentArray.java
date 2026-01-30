package interview_prgrams.GforG.Arrays;

public class CheckIfaValueisPresentArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 67, 8, 9, 3, 5, 5, 51, 1};
        int key = 5;
        int count = 0;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                count++;
            }
        }

        if (found) {
            System.out.println(key + " is present in the array.");
            System.out.println("It appears " + count + " time(s).");
        } else {
            System.out.println(key + " is NOT present in the array.");
        }
    }
}
