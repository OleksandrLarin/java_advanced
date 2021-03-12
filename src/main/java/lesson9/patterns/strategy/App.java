package lesson9.patterns.strategy;

public class App {
    public static void main(String[] args) {
        Context context = new Context();

        context.execute("message", "console");
        context.execute("message2", "file");
        context.execute("message3", "email");
    }
}
