package java8_features;

import java.util.*;

public class SortDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(5,3,1));

        list.sort((a, b) -> a - b);
        System.out.println(list);
    }
}

