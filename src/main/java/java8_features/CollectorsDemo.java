package java8_features;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "a");

        Set<String> set =
                list.stream().collect(Collectors.toSet());

        System.out.println(set);
    }
}
