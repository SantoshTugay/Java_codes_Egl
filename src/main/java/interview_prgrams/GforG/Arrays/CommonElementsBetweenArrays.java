package interview_prgrams.GforG.Arrays;

public class CommonElementsBetweenArrays {
    public static void main(String args[]) {
//        int arr[]={1,2,3,4,5};
//        int arr1[]={5,4,3,3,1};

        String[] arr = { "Article", "in", "Geeks", "for", "Geeks" };
        String[] arr1 = { "Geeks", "for", "Geeks" };

        System.out.print("Common elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i] == arr1[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }

}
