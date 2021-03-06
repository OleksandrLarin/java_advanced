package lecture8.collections.queue.priority;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer left, Customer right) {
        int result = left.getStatus().compareTo(right.getStatus());
        if (result == 0) {
            return Integer.compare(left.getOrder(), right.getOrder());
        }
        return result;
    }
}
