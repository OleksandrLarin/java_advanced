package lesson9.patterns.abstractFactory;

public abstract class PhoneFactory {
    public abstract Phone createPhone(String name, int price);

    protected void initialize(String name, int price, Phone product) {
        product.setName(name);
        product.setPrice(price);
    }

    public abstract Chehol createChehol();

}
