package lesson9.patterns.cor;

public interface Handler {
    void handle(Event event);

    void setNextHandler(Handler nextHandler);
}
