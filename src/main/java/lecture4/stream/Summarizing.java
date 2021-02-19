package lecture4.stream;

import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

public class Summarizing {
    public static void main(String[] args) {
        List<String> productNames = List.of("phone", "tv", "mobile", "laptop", "tv", "PC");

        LongSummaryStatistics statistics = productNames.stream()
                .collect(Collectors.summarizingLong(String::length));

        System.out.println("Max: " + statistics.getMax());
        System.out.println("Average: " + statistics.getAverage());
    }
}
