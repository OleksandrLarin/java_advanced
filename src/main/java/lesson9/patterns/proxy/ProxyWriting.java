package lesson9.patterns.proxy;

public class ProxyWriting implements Writer {

    private int count = 0;
    private Writer writer = new ConsoleWriter();

    @Override
    public void write() {
        System.out.println("log info: " + ++count);
        writer.write();
    }
}
