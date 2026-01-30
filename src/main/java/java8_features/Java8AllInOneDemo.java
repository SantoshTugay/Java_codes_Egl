package java8_features;

import java.time.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Java8AllInOneDemo {

    public static void main(String[] args) {

        // 1. Lambda Expression
        Runnable r = () -> System.out.println("Lambda executed");
        r.run();

        // 2. Functional Interface
        Calculator1 calc = (a, b) -> a + b;
        System.out.println("Addition: " + calc.add(10, 20));

        // 3. Predicate, Function, Consumer, Supplier
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Function<Integer, Integer> square = n -> n * n;
        Consumer<String> printer = s -> System.out.println(s);
        Supplier<String> supplier = () -> "Supplied value";

        System.out.println(isEven.test(4));
        System.out.println(square.apply(5));
        printer.accept("Consumer executed");
        System.out.println(supplier.get());

        // 4. Method Reference
        List<String> names = List.of("Santosh", "Java", "QA");
        names.forEach(System.out::println);

        // 5. Stream API – filter, map, forEach
        List<Integer> nums = List.of(1,2,3,4,5);
        nums.stream()
                .filter(n -> n > 2)
                .map(n -> n * 10)
                .forEach(System.out::println);

        // 6. map vs flatMap
        List<List<Integer>> nested =
                List.of(List.of(1,2), List.of(3,4));
        nested.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);

        // 7. Reduce
        int sum = nums.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        // 8. Collectors
        Set<Integer> set =
                nums.stream().collect(Collectors.toSet());
        System.out.println("Set: " + set);

        // 9. GroupingBy
        List<String> fruits = List.of("apple","banana","apple");
        Map<String, Long> countMap =
                fruits.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()));
        System.out.println(countMap);

        // 10. Optional
        String value = null;
        Optional<String> opt = Optional.ofNullable(value);
        System.out.println(opt.orElse("Default"));

        // 11. Default Method
        Vehicle1 vehicle = new Car();
        vehicle.start();

        // 12. Static Method in Interface
        Utils.print();

        // 13. Date & Time API
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        // 14. Parallel Stream
        nums.parallelStream().forEach(System.out::println);

        // 15. Sorting using Lambda
        List<Integer> sortList = new ArrayList<>(List.of(5,1,3));
        sortList.sort((a, b) -> a - b);
        System.out.println(sortList);

        // 16. findFirst / findAny
        nums.stream().findFirst().ifPresent(System.out::println);

        // 17. Real-time validation example
        List<Integer> apiStatusCodes = List.of(200, 201, 204);
        boolean allSuccess =
                apiStatusCodes.stream().allMatch(code -> code < 400);
        System.out.println("All APIs success: " + allSuccess);
    }
}

/* Functional Interface */
@FunctionalInterface
interface Calculator1 {
    int add(int a, int b);
}

/* Default method demo */
interface Vehicle1 {
    default void start() {
        System.out.println("Vehicle started");
    }
}

class Car implements Vehicle1 {}

/* Static method demo */
interface Utils {
    static void print() {
        System.out.println("Static method executed");
    }
}

