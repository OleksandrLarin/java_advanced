package lesson9.oop.inheritance;

public class Bird implements Flyable {

    private String name;
    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println("Eating");
    }
}
