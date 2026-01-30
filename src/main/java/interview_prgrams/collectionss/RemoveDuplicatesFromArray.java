package interview_prgrams.collectionss;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 3, 1, 1, 1,};
     //   List<Integer> arr = Arrays.asList(10, 20, 30, 10, 20);
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println(set);

        int[] result = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(result));
    }
}
