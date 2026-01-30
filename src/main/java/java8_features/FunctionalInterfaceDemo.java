package java8_features;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Calculator c = (a, b) -> a + b;
        System.out.println(c.add(10, 20));
    }
}
