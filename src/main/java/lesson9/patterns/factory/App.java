package lesson9.patterns.factory;

public class App {
    public static void main(String[] args) {
        ProductFactory tvFactory = new TvFactory();
        ProductFactory phoneFactory = new TvFactory();
        Product product = tvFactory.createProduct("Product 1", 10);
    }
}
