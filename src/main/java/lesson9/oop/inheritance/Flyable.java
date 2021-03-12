package lesson9.oop.inheritance;

public interface Flyable {
    int age = 0;
    void fly();

    String getName();

    default String info() {
        System.out.println();
        return getName() + getSecret();
    }

    private String getSecret() {
        return "";
    }

    static void create() {

    };
}
