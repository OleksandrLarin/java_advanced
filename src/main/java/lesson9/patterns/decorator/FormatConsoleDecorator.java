package lesson9.patterns.decorator;

public class FormatConsoleDecorator extends Decorator {

    public FormatConsoleDecorator(Writer writer) {
        super(writer);
    }

    @Override
    public void write(String message) {
        String formattedMessage = "{" + message + "}";
        writer.write(formattedMessage);
    }
}
