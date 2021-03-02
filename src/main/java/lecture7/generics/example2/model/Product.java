package lecture7.generics.example2.model;

public class Product extends Entity {
    public Product(int id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                '}';
    }
}
