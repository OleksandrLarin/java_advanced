package lecture5.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCalculator implements Calculator {
    private String message = "Negative numbers are not allowed here. Value of: %s";

    @Override
    public int add(String numbers) {
        String spliterator = "[^\\d|-]+";
        List<String> stringList = Arrays.asList(numbers.split(spliterator));
        List<Integer> negativeNumbers = new ArrayList<>();

        final int sum = stringList.stream()
                .mapToInt(Integer::valueOf)
                .filter(value -> isPositiveNumber(value, negativeNumbers))
                .sum();

        checkForNegativeNumbers(negativeNumbers);

        return sum;
    }

    private boolean isPositiveNumber(int value, List<Integer> negativeNumbers) {
        if (value < 0) {
            negativeNumbers.add(value);
            return false;
        }
        return true;
    }

    private void checkForNegativeNumbers(List<Integer> negativeNumbers) {
        if (negativeNumbers.isEmpty()) {
            return;
        }
        final String numbers = negativeNumbers.stream().map(String::valueOf).collect(Collectors.joining(", "));
        throw new RuntimeException(String.format(message, numbers));
    }
}
