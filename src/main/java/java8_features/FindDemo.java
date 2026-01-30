package java8_features;

import java.util.*;

public class FindDemo {
    public static void main(String[] args) {
        List<String> list = List.of("Java", "Python");

        list.stream().findFirst()
                .ifPresent(System.out::println);
    }
}

