package lecture5.tdd;

import java.util.Arrays;
import java.util.List;

public class StringCalculator implements Calculator {
    private String message = "Negative numbers are not allowed here. Value of: \\d";

    @Override
    public int add(String numbers) {
        String spliterator = "[^\\d|-]+";
        List<String> stringList = Arrays.asList(numbers.split(spliterator));

        return stringList.stream()
                .mapToInt(Integer::valueOf)
                .map(this::validateNumber)
                .sum();
    }

    private int validateNumber(int i) {
        if (i < 0) {
            throw new RuntimeException(String.format(message, i));
        }
        return i;
    }
}
