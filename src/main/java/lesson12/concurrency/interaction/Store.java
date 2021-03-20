package lesson12.concurrency.interaction;

import java.util.Stack;

public class Store {
    private Stack<Product> products = new Stack<>();

    public synchronized void put(Product product) {
        if (products.size() > 3) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        products.push(product);
        notify();
    }

    public synchronized Product get() {
        if (products.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        notify();
        return products.pop();
    }

    public synchronized boolean hasNext() {
        return !products.isEmpty();
    }
}
