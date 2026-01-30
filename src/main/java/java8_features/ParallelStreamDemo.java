package java8_features;

import java.util.*;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4);

        list.parallelStream()
                .forEach(System.out::println);
    }
}
