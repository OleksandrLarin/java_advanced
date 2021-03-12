package lesson9.patterns.adapter;

import lesson9.patterns.adapter.car.Audi;

public class App {
    public static void main(String[] args) {
        Driver driver = new Driver(new Audi());

        driver.drive();

        driver.setTransport(new CarAdapter(new Bicycle()));

        driver.drive();
    }
}
