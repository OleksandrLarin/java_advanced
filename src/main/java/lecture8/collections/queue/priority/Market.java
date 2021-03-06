package lecture8.collections.queue.priority;

import java.util.PriorityQueue;

public class Market {

    private final PriorityQueue<Customer> customersQueue = new PriorityQueue<>(new CustomerComparator());
    private int order = 0;

    public void addCustomer(Customer customer) {
        customer.setOrder(++order);
        customersQueue.add(customer);
    }

    public Customer getNextCustomer() {
        return customersQueue.poll();
    }

    public boolean hasNext() {
        return !customersQueue.isEmpty();
    }
}
