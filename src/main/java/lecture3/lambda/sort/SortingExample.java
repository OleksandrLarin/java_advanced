package lecture3.lambda.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<Product> products = new SortingExample().getProducts();

        products.sort(new ProductComparator());

        Comparator<Product> comparator = (left, right) ->   {
            double price1 = Double.valueOf(left.getPrice());
            double price2 = Double.valueOf(right.getPrice());
            return Double.compare(price1, price2);
        };


        products.sort(comparator);

        System.out.println(products);
    }

    int compare(Comparator<Product> comparator) {
        return 1;
    }



    private List<Product> getProducts() {
        Product phone = new Product();
        phone.setPrice("1000");

        Product tv = new Product();
        tv.setPrice("500");

        Product notebook = new Product();
        notebook.setPrice("2100");

        List<Product> products = new ArrayList<>();
        products.add(phone);
        products.add(notebook);
        products.add(tv);
        return products;
    }
}
