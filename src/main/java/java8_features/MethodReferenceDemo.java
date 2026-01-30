package java8_features;

import java.util.*;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        // Immutable List creation (Java 9+ utility used here)
        List<String> list = List.of("A", "B", "C");

        // METHOD REFERENCE FEATURE:
        // Syntax: ClassName::methodName or InstanceName::methodName

        // 1. Feature: It refers to a method without executing it immediately.
        // 2. Feature: It acts as a more concise alternative to a Lambda expression.
        // 3. Feature: Here, it uses 'Instance Method Reference' of an arbitrary object.

        // This is equivalent to: list.forEach(s -> System.out.println(s));
        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);
    }
}