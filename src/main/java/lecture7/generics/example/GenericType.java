package lecture7.generics.example;

public class GenericType<T> {
    private int id;
    private final T item;

    public GenericType(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
