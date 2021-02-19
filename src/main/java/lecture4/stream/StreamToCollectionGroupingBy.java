package lecture4.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamToCollectionGroupingBy {
    public static void main(String[] args) {
        List<String> productNames = List.of("phone", "tv", "mobile", "laptop", "tv", "PC");

        Map<Integer, List<Product>> collect = productNames.stream().parallel()
                .map(Product::new)
                .map(StreamToCollectionGroupingBy::setRandomCategory)
                .collect(Collectors.groupingBy(Product::getCategoryId));

        System.out.println(collect);
        Map<Boolean, List<Product>> partition = productNames.stream()
                .map(Product::new)
                .map(StreamToCollectionGroupingBy::setRandomCategory)
                .collect(Collectors.partitioningBy(product -> product.getCategoryId() > 2));

        System.out.println(partition);

        List<Product> productList = productNames.stream()
                .map(Product::new)
                .map(StreamToCollectionGroupingBy::setRandomCategory)
                .collect(Collectors.toList());

        Map<Integer, Long> integerLongMap = productList.stream()
                .collect(Collectors.groupingBy(Product::getCategoryId, Collectors.counting()));

        Map<Integer, Double> integerDoubleMap = productList.stream()
                .collect(Collectors.groupingBy(Product::getCategoryId, Collectors.summingDouble(Product::getPrice)));

        Map<Integer, Optional<Product>> collectionOfProduct = productList.stream().parallel()
                .collect(Collectors.groupingBy(Product::getCategoryId, Collectors.maxBy(Comparator.comparing(Product::getName))));

        System.out.println(collectionOfProduct);
    }

    private static Product setRandomCategory(Product product) {
        product.setCategoryId(new Random().nextInt(4));
        return product;
    }
}
