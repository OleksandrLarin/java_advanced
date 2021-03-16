package lesson11.internetMarket;

import lesson11.internetMarket.dao.ProductDao;
import lesson11.internetMarket.model.Product;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();

//        Product newProduct = new Product(3, "Sony TV", "TV", BigDecimal.valueOf(10900.00).setScale(2));
//        productDao.create(newProduct);
//        Product updatedProduct = new Product(1, "Samsung TV", "TV", BigDecimal.valueOf(10500.00).setScale(2));
//        productDao.update(updatedProduct);
//        Product product = productDao.findById(1);
//        System.out.println(product);
        System.out.println(productDao.findAll());
    }
}
