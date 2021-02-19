package lecture3.stream.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("abc,bcd,cde", "bb,aa,cc", "C,C,A");
        stream.map(String::toUpperCase)
                .filter(element -> element.length() > 1)
                .flatMap(element -> Stream.of(element.split(",")))
                .forEach(System.out::println);

        Stream.of("abc,bcd,cde", "bb,aa,cc", "C,C,A")
                .map(String::toUpperCase)
                .filter(element -> element.length() > 1)
                .map(element -> element.split(","))
                .forEach((e) -> System.out.println(Arrays.toString(e)));

        Stream.generate(Math::random);
        Stream.generate(() -> Math.random());

        long count = Stream.of("abc,bcd,cde", "bb,aa,cc", "C,C,A")
                .map(String::toUpperCase)
                .filter(element -> element.length() > 1)
                .flatMap(element -> Stream.of(element.split(",")))
                .count();

        System.out.println(count);
    }
}
