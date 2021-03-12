package lesson9.oop.inheritance;

public class Airplane implements Flyable {
    private String name;

    @Override
    public void fly() {
        System.out.println("Flying....");
    }

    @Override
    public String getName() {
        return name;
    }

    public void fillFuel() {
        System.out.println("Fill Fuel");
    }
}
