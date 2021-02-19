package lecture4.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamCollectToList {
    public static void main(String[] args) {
        List<String> productNames = List.of("phone", "tv", "mobile", "laptop", "tv", "PC");

        Set<Product> productList = productNames.stream()
                .map(String::toUpperCase)
                .map(Product::new)
                .collect(Collectors.toSet());

        System.out.println(productList);


        TreeSet<String> collect = productNames.stream()
                .collect(StreamCollectToList::createSet, TreeSet::add, TreeSet::addAll);

        System.out.println(productNames.stream().collect(Collectors.joining(", ")));
//        StringBuilder sb = new StringBuilder();
//        for (String name: productNames) {
//            sb.append(name);
//            sb.append(", ");
//        }
//
//        System.out.println(sb);
    }

    private static TreeSet<String> createSet() {
        return new TreeSet<>(Comparator.comparing(String::length));
    }
}
