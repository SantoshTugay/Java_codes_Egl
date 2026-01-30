package java8_features;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        String name = null;

        Optional<String> opt = Optional.ofNullable(name);
        System.out.println(opt.orElse("Default Value"));
    }
}

