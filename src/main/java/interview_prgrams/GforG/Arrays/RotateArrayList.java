package interview_prgrams.GforG.Arrays;

import java.util.*;

public class RotateArrayList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(11, 12, 13, 14, 15));
        int k1 = 2;
        Collections.rotate(list, k1);
        System.out.println("Java 8 used : " + list); // Output: [4, 5, 1, 2, 3]

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k = 2;
        int n = list1.size();
        k = k % n; // In case k > n

        List<Integer> rotated = new ArrayList<>();
        rotated.addAll(list1.subList(n - k, n));
        rotated.addAll(list1.subList(0, n - k));

        System.out.println(rotated); // Output: [4, 5, 1, 2, 3]
    }
}

