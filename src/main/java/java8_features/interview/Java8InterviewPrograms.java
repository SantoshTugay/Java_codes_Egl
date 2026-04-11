package java8_features.interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Java8InterviewPrograms {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,2,3,null);
        List<String> names = Arrays.asList("java","automation","api","java");

        System.out.print("1. Remove Duplicates:");
        list.stream().filter(Objects::nonNull).distinct().forEach(System.out::println);

        System.out.println("\n2. Find Duplicates:");
        list.stream()
                .filter(Objects::nonNull)
                .filter(i -> Collections.frequency(list, i) > 1)
                .distinct()
                .forEach(System.out::println);

        System.out.println("\n3. First Non-Repeated Character:");
        String str = "aabbcdde";
        str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .ifPresent(e -> System.out.println(e.getKey()));

        System.out.print("\n4. Frequency of Characters:");
        str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k,v) -> System.out.println(k + ":" + v));

        System.out.println("\n5. Sort Asc/Desc:");
        list.stream().filter(Objects::nonNull).sorted().forEach(System.out::print);
        System.out.println();
        list.stream().filter(Objects::nonNull).sorted(Comparator.reverseOrder()).forEach(System.out::print);

        System.out.println("\n\n6. Max & Min:");
        list.stream().filter(Objects::nonNull).max(Integer::compare).ifPresent(System.out::println);
        list.stream().filter(Objects::nonNull).min(Integer::compare).ifPresent(System.out::println);

        System.out.println("\n7. Sum:");
        int sum = list.stream().filter(Objects::nonNull).reduce(0, Integer::sum);
        System.out.println(sum);

        System.out.print("\n8. Even Numbers:");
        list.stream().filter(Objects::nonNull).filter(n -> n % 2 == 0).forEach(System.out::println);

        System.out.println("\n9. Uppercase:");
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("\n10. Second Highest:");
        list.stream().filter(Objects::nonNull)
                .distinct().sorted(Comparator.reverseOrder())
                .skip(1).findFirst().ifPresent(System.out::println);

        System.out.println("\n11. Longest String:");
        names.stream().max(Comparator.comparingInt(String::length)).ifPresent(System.out::println);

        System.out.print("\n12. Remove Null:");
        list.stream().filter(Objects::nonNull).forEach(System.out::println);

        System.out.println("\n13. Grouping (Even/Odd):");
        list.stream().filter(Objects::nonNull)
                .collect(Collectors.groupingBy(n -> n % 2))
                .forEach((k,v) -> System.out.println(k + ":" + v));

        System.out.println("\n14. Partition:");
        list.stream().filter(Objects::nonNull)
                .collect(Collectors.partitioningBy(n -> n % 2 == 0))
                .forEach((k,v) -> System.out.println(k + ":" + v));

        System.out.print("\n15. List to Map:");
        list.stream().filter(Objects::nonNull)
                .distinct()
                .collect(Collectors.toMap(Function.identity(), i -> "Val" + i))
                .forEach((k,v) -> System.out.println(k + ":" + v));

        System.out.print("\n16. Flatten List:");
        List<List<Integer>> nested = Arrays.asList(Arrays.asList(1,2), Arrays.asList(3,4));
        nested.stream().flatMap(List::stream).forEach(System.out::println);

        System.out.println("\n17. Duplicate Characters:");
        String s = "programming";
        s.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .forEach(System.out::println);

        System.out.println("\n18. Palindrome:");
        String p = "madam";
        boolean isPal = IntStream.range(0, p.length()/2)
                .allMatch(i -> p.charAt(i) == p.charAt(p.length()-1-i));
        System.out.println(isPal);

        System.out.println("\n19. First Element:");
        list.stream().filter(Objects::nonNull).findFirst().ifPresent(System.out::println);

        System.out.println("\n20. Skip & Limit:");
        list.stream().filter(Objects::nonNull).skip(2).limit(3).forEach(System.out::println);

        System.out.print("\n21. Parallel Stream:");
        list.parallelStream().filter(Objects::nonNull).forEach(System.out::println);

        System.out.println("\n22. Sort Map by Value:");
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"B"); map.put(2,"A");
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

        System.out.println("\n23. Average:");
        list.stream().filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .average().ifPresent(System.out::println);

        System.out.println("\n24. Match:");
        System.out.println(list.stream().filter(Objects::nonNull).allMatch(n -> n > 0));
        System.out.println(list.stream().filter(Objects::nonNull).anyMatch(n -> n > 5));

        System.out.print("\n25. Collect to Set:");
        list.stream().filter(Objects::nonNull)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}