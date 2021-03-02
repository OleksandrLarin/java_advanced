package lecture7.generics.example2;

import lecture7.generics.example2.creator.CarCreatorImpl;
import lecture7.generics.example2.creator.ProductCreatorImpl;
import lecture7.generics.example2.creator.UserCreatorImpl;
import lecture7.generics.example2.model.Car;
import lecture7.generics.example2.model.Product;
import lecture7.generics.example2.model.User;

public class App {
    public static void main(String[] args) {
        UserCreatorImpl userCreator = new UserCreatorImpl();
        User user = userCreator.apply(123, "Bill");

        ProductCreatorImpl productCreator = new ProductCreatorImpl();
        Product product = productCreator.apply(321, "TV");

        CarCreatorImpl carCreator = new CarCreatorImpl();
        Car car = carCreator.apply(12315615615616L, 1231);

        System.out.println(user);
        System.out.println(product);
        System.out.println(car);
    }
}
