package java8_features;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingDemo {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "apple");

        Map<String, Long> map =
                list.stream().collect(
                        Collectors.groupingBy(
                                s -> s, Collectors.counting()));

        System.out.println(map);
    }
}

