package java8_features;

import java.util.List;

public class StreamBasicDemo {
    public static void main(String args[]){
        List<Integer> al= List.of(1,2,3,2,45,9);
        al.stream().filter(n->n%2==0)
                .map(n->n*10)
                .forEach(System.out::println);
    }
}
