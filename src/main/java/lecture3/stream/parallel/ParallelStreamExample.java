package lecture3.stream.parallel;

import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        IntStream.rangeClosed(0,10).parallel().forEach((e) -> System.out.println(Thread.currentThread().getName()));
    }
}
