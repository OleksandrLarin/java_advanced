package lecture4.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamToMap {
    public static void main(String[] args) {
        List<String> productNames = List.of("phone", "tv", "mobile", "laptop", "tv", "PC");

        Map<String, Integer> collect = productNames.stream()
                .distinct()
                .collect(Collectors.toMap(Function.identity(), String::length));

        System.out.println(collect);
    }
}
