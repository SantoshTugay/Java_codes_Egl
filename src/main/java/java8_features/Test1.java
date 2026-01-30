package java8_features;

public interface Test1 {

    public default void m1(){
        var x=10;
        System.out.println(x);
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}
