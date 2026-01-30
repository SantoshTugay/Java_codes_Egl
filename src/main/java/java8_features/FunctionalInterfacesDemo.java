package java8_features;

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionalInterfacesDemo {
    public static void main(String[] args) {

        // 1. PREDICATE: Represents a boolean-valued function of one argument.
        // Feature: It takes an input and returns a 'boolean'.
        // Main Method: test(T t)
        // Common Use: Filtering data (e.g., in Stream.filter()).
        Predicate<Integer> p = n -> n > 10;
        System.out.println("Predicate test (15 > 10): " + p.test(15)); // Returns true

        // 2. FUNCTION: Represents a function that accepts one argument and produces a result.
        // Feature: It transforms an input of type T into an output of type R.
        // Main Method: apply(T t)
        // Common Use: Mapping data (e.g., in Stream.map()).
        Function<Integer, Integer> f = n -> n * 2;
        System.out.println("Function apply (5 * 2): " + f.apply(5)); // Returns 10

        // 3. CONSUMER: Represents an operation that accepts a single input and returns no result.
        // Feature: It "consumes" the input (side-effects like printing/logging) and returns 'void'.
        // Main Method: accept(T t)
        // Common Use: Iterating over elements (e.g., in forEach()).
        Consumer<String> c = s -> System.out.println("Consumer accept: " + s);
        c.accept("Java 8"); // Performs the action (printing)

        // 4. SUPPLIER: Represents a supplier of results.
        // Feature: It takes NO input but produces/returns an output of type T.
        // Main Method: get()
        // Common Use: Lazy generation of values, factories, or default values.
        Supplier<String> s = () -> "Supplied Value";
        System.out.println("Supplier get: " + s.get()); // Supplies the string
    }
}