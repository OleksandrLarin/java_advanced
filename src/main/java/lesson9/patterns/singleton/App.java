package lesson9.patterns.singleton;

public class App {
    public static void main(String[] args) {
        Singleton singleton_1 = Singleton.getInstance();
        Singleton singleton_2 = Singleton.getInstance();

        System.out.println(singleton_1 == singleton_2);
    }
}
