package lesson12.concurrency.interaction;

import java.util.stream.Stream;

public class Supplier extends Thread {
    private final Store store;

    public Supplier(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        synchronized (store) {
            Stream.generate(() -> 1)
                    .limit(10)
                    .forEach((i) -> store.put(new Product()));
        }
    }
}
