package interview_prgrams.collectionss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingFields {
    public static void main(String[] args) {
        // Wrap Arrays.asList in a new ArrayList to make it mutable (modifiable)
        List<String> l1 = new ArrayList<>(Arrays.asList("id", "name", "email", "phone"));
        List<String> l2 = new ArrayList<>(Arrays.asList("id", "name", "phone"));

        l1.removeAll(l2);
        l1.retainAll(l2);

        System.out.println("l1"+l1);
        System.out.println("l2"+l2);

        List<Integer> l3 = new ArrayList<>(Arrays.asList(1, 3, 4, 3));
        List<Integer> l4 = Arrays.asList(1, 2, 3);
        l3.removeAll(l4);

        System.out.println(l3);
    }
}
