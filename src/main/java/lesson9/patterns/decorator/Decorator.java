package lesson9.patterns.decorator;

public abstract class Decorator implements Writer{
    protected Writer writer;

    public Decorator(Writer writer) {
        this.writer = writer;
    }
}
