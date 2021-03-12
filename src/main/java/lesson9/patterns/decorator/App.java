package lesson9.patterns.decorator;

public class App {
    public static void main(String[] args) {
        Writer writer = new FormatConsoleDecorator(new FormatConsoleDecorator(new ConsoleWriter()));

        writer.write("message: \"Hello World\"");
    }
}
