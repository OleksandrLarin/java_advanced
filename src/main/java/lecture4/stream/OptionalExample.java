package lecture4.stream;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("string");
        Optional<String> optional_2 = Optional.ofNullable("string");
        Optional<String> optional_null = Optional.ofNullable(null);
        Optional<String> optional_3 = Optional.empty();

        if (optional.isPresent()) {
            System.out.println(optional.get().length());
        }

        if (optional_2.isEmpty()) {
            throw new RuntimeException("Exception");
        }

        optional_3.ifPresent(System.out::println);


        optional_null.ifPresentOrElse(System.out::println, () -> System.out.println("Optional_Null is not present"));
    }
}
