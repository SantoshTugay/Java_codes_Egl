package interview_prgrams.collectionss;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int res[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            res[i]=arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(res));

        Integer[] arr1 = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(arr1);
        Collections.reverse(list);
        System.out.println(list);

    }
}
