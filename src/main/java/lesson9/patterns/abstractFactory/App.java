package lesson9.patterns.abstractFactory;

public class App {
    public static void main(String[] args) {
        PhoneFactory factory = new SamsungFactory();

        Phone samsung = factory.createPhone("Sumsung", 100);
        Chehol cheholSamsung = factory.createChehol();
    }
}
