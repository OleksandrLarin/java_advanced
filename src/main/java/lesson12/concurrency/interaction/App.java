package lesson12.concurrency.interaction;

public class App {
    public static void main(String[] args) {
        Store store = new Store();
        Consumer consumer = new Consumer(store);
        consumer.start();
        Consumer consumer2 = new Consumer(store);
        consumer2.start();
        Supplier supplier = new Supplier(store);
        supplier.start();
    }
}
