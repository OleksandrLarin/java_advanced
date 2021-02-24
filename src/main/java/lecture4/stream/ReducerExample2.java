package lecture4.stream;

import java.util.Arrays;
import java.util.List;

public class ReducerExample2 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        // parallel: 10*1 + 10*2 + 10*3 + 10*4
        Integer sum = numbers.stream().parallel()
                .reduce(10, (identity, val) -> identity * val, (left, right) -> left + right);

        // последовательно: 10*1, 10*2=20, 20*3=60, 60*4=240
        Integer seqSum = numbers.stream()
                .reduce(10, (identity, val) -> identity * val, (left, right) -> left + right);

        System.out.println(sum); //output 60
    }
    private static int combine(Integer x, Integer y) {
        System.out.printf("combiner x: %s, y: %s\n", x, y);
        return x * y;
    }
}
