package lecture4.stream;

import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<String> strings = List.of("One", "Two", "Three", "Four");

        strings.stream()
                .map(String::length)
                .reduce((a, b) -> a + b)
                .ifPresent(System.out::println);

        Integer reduce = strings.stream()
                .map(String::length)
                .reduce(0, (a, b) -> a + b);
        System.out.println(reduce);


        Integer reduce1 = strings.stream()
                .reduce(0, (i, string) -> i + string.length(), (a, b) -> a + b);

        System.out.println(reduce1);

    }
}
