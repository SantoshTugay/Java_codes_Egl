package java8_features;

import java.util.List;

public class ReduceDemo {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4);

        int sum = nums.stream()
                .reduce(2, Integer::sum);

        System.out.println(sum);
    }
}
