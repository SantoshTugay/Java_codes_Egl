package interview_prgrams.GforG.Arrays;

public class ArrayEquality {
    public static void main(String args[]) {
        int arr1[] = {1, 2, 4};
        int arr2[] = {1, 2, 4};

        if (arr1.length != arr2.length) {
            System.out.println("Both arrays are not equal");
        } else {
            boolean isEqual = true;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual) {
                System.out.println("Both arrays are equal");
            } else {
                System.out.println("Both arrays are not equal");
            }
        }
    }
}