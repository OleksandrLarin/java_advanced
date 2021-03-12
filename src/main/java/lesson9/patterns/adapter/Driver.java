package lesson9.patterns.adapter;

import lesson9.patterns.adapter.car.Car;

public class Driver {
    private Car transport;

    public Driver(Car car) {
        this.transport = car;
    }

    public void drive() {
        transport.drive();
    }

    public void setTransport(Car car) {
        this.transport = car;
    }
}
