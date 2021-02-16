package lecture3.lambda.sort;

import java.util.Comparator;


public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product left, Product right) {
        return left.getPrice().compareTo(right.getPrice());
    }
}
