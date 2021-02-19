package lecture4.stream;

import java.util.Optional;

public class OptionalIntermediate {
    private static double counter = 0;

    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.of("One,Two,Three,Four");
        stringOptional.map(String::toUpperCase).ifPresent(System.out::println);
        stringOptional
                .filter(str -> str.length() > 5)
                .map(String::toUpperCase)
                .ifPresent(System.out::println);

        Optional<Double> o = Optional.of("123")
                .flatMap(str -> {
                    if (str.matches("\\d*")) {
                        return Optional.of(Double.valueOf(str));
                    }
                    return Optional.empty();
                });

        o.ifPresent(System.out::println);
        o.ifPresent(System.out::println);
        double number = o.orElse(0.0);


        Optional<Double> emptyDouble = Optional.empty();
        Double number1 = emptyDouble.orElse(getDouble());
        System.out.println("Number 1: " + number1);

        Double number2 = emptyDouble.orElseGet(() -> getDouble());
        System.out.println("Number 2: " + number2);

        System.out.println("Counter: " + counter);
    }

    private static double getDouble() {
        return ++counter;
    }
}
