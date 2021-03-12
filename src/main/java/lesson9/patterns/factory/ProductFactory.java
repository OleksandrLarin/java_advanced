package lesson9.patterns.factory;

public abstract class ProductFactory {
    public abstract Product createProduct(String name, int price);
    protected void initialize(String name, int price, Product product) {
        product.setName(name);
        product.setPrice(price);
    }
}
