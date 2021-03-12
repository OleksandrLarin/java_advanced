package lesson9.patterns.proxy;

public class ConsoleWriter implements Writer{
    @Override
    public void write() {
        System.out.println("Writing...");
    }
}
