package lesson9.oop.incapsulation;

public class App {
    public static void main(String[] args) {
        Container container = new Container();

        container.addString("dfvdfv");

        container.getStringList().clear();

        System.out.println(container.getStringList().size());
    }

    public void clearList(Container container) {
        container.getStringList().stream().forEach(System.out::println);
        container.getStringList().clear();
    }
}
