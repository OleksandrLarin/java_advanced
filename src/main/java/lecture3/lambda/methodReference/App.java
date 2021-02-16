package lecture3.lambda.methodReference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Локальные переменные
 * Аргументы
 * effectively final* переменные
 * this
 */
public class App {
    public static void main(String[] args) {
        App app = new App();

        call((s) -> s.toLowerCase());
        call(String::toUpperCase);
        call(app::format);

        final String effectivelyFinal = "effectively final";
//        effectivelyFinal = "";
        List<String> list =new ArrayList<>();
        createList(() -> new ArrayList<>());
        createList(ArrayList::new);
        list.add("0");
        createList(() -> {
            list.add("11");
            ArrayList<List<String>> strings = new ArrayList<>();
            strings.add(list);

            return strings.get(0);
        });
    }

    public String format(String string) {
        return String.valueOf(string.length());
    }

    private static List<String> createList(Supplier<List<String>> supplier) {
        return supplier.get();
    }

    private static void call(Function<String, String> function) {
        String hello = function.apply("Hello");
        System.out.println(hello);
    }
}
