package java8_features;

public interface Vehicle {
    default void start() {
        System.out.println("Vehicle started");
    }
    static void print() {
        System.out.println("Static method in interface");
    }

    public class DefaultMethodDemo {
        public static void main(String[] args) {
            Vehicle v = new Vehicle() {};
            v.start();
            Vehicle.print();
        }
    }
}
