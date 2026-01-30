package java8_features;

public class LambdaExp_1 {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Lambda running");
        r.run();
    }
}