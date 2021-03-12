package lesson9.patterns.adapter;

import lesson9.patterns.adapter.car.Car;

public class CarAdapter implements Car {

    private Bicycle bicycle;

    public CarAdapter(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void drive() {
        bicycle.ride();
    }
}
