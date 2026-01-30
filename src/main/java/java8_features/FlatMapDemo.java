package java8_features;

import java.util.*;

public class FlatMapDemo {
    public static void main(String[] args) {

        List<List<Integer>> list =
                List.of(List.of(1,2), List.of(3,4));

        list.stream()
                .flatMap(l -> l.stream())
                .forEach(System.out::println);

        List<Integer> nums = List.of(1,2,3,4,5);

        nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 10)
                .forEach(System.out::println);
    }
}

