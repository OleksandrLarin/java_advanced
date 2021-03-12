package lesson9.patterns.proxy;

public class App {
    public static void main(String[] args) {
        Writer writer = new ProxyWriting();
        writer.write();
        writer.write();
        writer.write();
    }
}
