package lecture4.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Optional<Integer> min = Stream.of(123, 25, 669, 852, 54, 0, 556, 999)
                .max(Integer::compareTo);

//        System.out.println(min.get());

        Optional<Integer> first = Stream.of(123, 25, 669, 852, 54, 0, 556, 999)
                .findAny();
        System.out.println(first.get());

        Optional<Integer> optional = Stream.of(123, 25, 669, 852, 54, 0, 556, 999)
                .filter(i -> i > 500)
                .findFirst();

        optional.ifPresent(System.out::println);
    }

}
