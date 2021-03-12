package lesson9.patterns.adapter.car;

public class Audi implements Car{
    @Override
    public void drive() {
        System.out.println("Audi is driving");
    }
}
